package work.oscarramos.mascotas.mappers.rowmapper;

import org.springframework.jdbc.core.RowMapper;
import work.oscarramos.mascotas.models.Mascota;

import java.sql.ResultSet;
import java.sql.SQLException;


public class MascotasRowMapper implements RowMapper<Mascota> {

    @Override
    public Mascota mapRow(ResultSet rs, int rowNum) throws SQLException {
        Mascota mascota = new Mascota();
        mascota.setId(rs.getInt("idmascota"));
        mascota.setNombre(rs.getString("nombre"));
        mascota.setTipoMascota(rs.getInt("tipo_mascota"));
        mascota.setPropietario(rs.getInt("propietario"));
        return mascota;
    }
}