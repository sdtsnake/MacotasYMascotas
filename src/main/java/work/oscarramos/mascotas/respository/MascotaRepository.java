package work.oscarramos.mascotas.respository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import work.oscarramos.mascotas.mappers.rowmapper.MascotasRowMapper;
import work.oscarramos.mascotas.models.Mascota;

import java.util.List;

@Repository
public class MascotaRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    private final String sql1 =  "SELECT * FROM mascota";
    public List<Mascota> todasMascotas(){
        return jdbcTemplate.query(sql1,new MascotasRowMapper());
    };
    private final String sql2 = "SELECT * FROM mascota where mascota.propietario is null";
    public List<Mascota> mascotasSinPropietario(){
        return jdbcTemplate.query(sql2,new MascotasRowMapper());
    };
}
