package work.oscarramos.mascotas.respository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import work.oscarramos.mascotas.mappers.TipoMascotaMapper;
import work.oscarramos.mascotas.mappers.rowmapper.TipoMascotaRowMapper;
import work.oscarramos.mascotas.models.TipoMascotaCantidad;

import java.util.List;

@Repository
public class TipoMascoteRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private TipoMascotaMapper tipoMascotaMapper;

    private final String sql = "SELECT tm.descripcion, count(tm.idtipo_mascota) AS nro_mascotas \n" +
                               "FROM tipo_mascota AS tm, mascota AS m \n" +
                               "where tm.idtipo_mascota = m.tipo_mascota GROUP BY tm.idtipo_mascota, tm.descripcion; ";
    public List<TipoMascotaCantidad> nroMascotasPorTipo(){
        return jdbcTemplate.query(sql,new TipoMascotaRowMapper());
    };
}
