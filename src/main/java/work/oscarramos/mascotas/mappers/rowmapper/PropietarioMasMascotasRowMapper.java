package work.oscarramos.mascotas.mappers.rowmapper;

import org.springframework.jdbc.core.RowMapper;
import work.oscarramos.mascotas.models.Mascota;
import work.oscarramos.mascotas.models.PropietarioMasMascotas;

import java.sql.ResultSet;
import java.sql.SQLException;


public class PropietarioMasMascotasRowMapper implements RowMapper<PropietarioMasMascotas> {

    @Override
    public PropietarioMasMascotas mapRow(ResultSet rs, int rowNum) throws SQLException {
        PropietarioMasMascotas propietarioMasMascotas = new PropietarioMasMascotas();
        propietarioMasMascotas.setId(rs.getInt("idpropietario"));
        propietarioMasMascotas.setNombre(rs.getString("nombre"));
        propietarioMasMascotas.setDireccion(rs.getString("direccion"));
        propietarioMasMascotas.setTelefono(rs.getString("telefono"));
        propietarioMasMascotas.setCorreo(rs.getString("correo"));
        propietarioMasMascotas.setComentarios(rs.getString("comentarios"));
        propietarioMasMascotas.setNroMascotas(rs.getInt("nro_mascotas_propietario"));

        return propietarioMasMascotas;
    }
}