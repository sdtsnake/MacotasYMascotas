package work.oscarramos.mascotas.respository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import work.oscarramos.mascotas.mappers.rowmapper.PropietarioMasMascotasRowMapper;
import work.oscarramos.mascotas.mappers.rowmapper.PropietarioSinMascotasRowMapper;
import work.oscarramos.mascotas.mappers.rowmapper.PropietarioTipoMascotaRowMapper;
import work.oscarramos.mascotas.mappers.TipoMascotaMapper;
import work.oscarramos.mascotas.models.Propietario;
import work.oscarramos.mascotas.models.PropietarioMasMascotas;
import work.oscarramos.mascotas.models.PropietarioTipoMascota;

import java.util.List;

@Repository
public class PropietarioRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private TipoMascotaMapper tipoMascotaMapper;


    private final String sql1 =  "SELECT p.idpropietario, p.nombre, p.direccion, p.telefono, p.correo, p.comentarios, count(*) as nro_mascotas_propietario\n" +
            "FROM propietario as p,mascota as m where p.idpropietario = m.propietario GROUP BY p.idpropietario HAVING COUNT(*) > 1;";
    public List<PropietarioMasMascotas> propitarioConMascotas(){
        return jdbcTemplate.query(sql1,new PropietarioMasMascotasRowMapper());
    };

    private final String sql2 = "SELECT p.nombre, tm.descripcion, count(*) AS nro_mascotas \n" +
            "FROM tipo_mascota AS tm, mascota AS m, propietario AS p \n" +
            "where tm.idtipo_mascota = m.tipo_mascota and p.idpropietario = m.propietario  \n" +
            "GROUP BY p.nombre, tm.idtipo_mascota, tm.descripcion;";
    public List<PropietarioTipoMascota> propietarioPorTipoMascotas(){
        return jdbcTemplate.query(sql2,new PropietarioTipoMascotaRowMapper());
    };

    private final String sql3 =  "SELECT * \n" +
            "FROM propietario \n" +
            "where propietario.idpropietario not in(select distinct mascota.propietario from mascota where mascota.propietario is not null)";
    public List<Propietario> PropietarioSinMacotas(){
        return jdbcTemplate.query(sql3,new PropietarioSinMascotasRowMapper());
    };










}
