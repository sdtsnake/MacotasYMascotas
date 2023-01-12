package work.oscarramos.mascotas.mappers.rowmapper;

import org.springframework.jdbc.core.RowMapper;
import work.oscarramos.mascotas.models.Propietario;
import work.oscarramos.mascotas.models.PropietarioMasMascotas;

import java.sql.ResultSet;
import java.sql.SQLException;


public class PropietarioSinMascotasRowMapper implements RowMapper<Propietario> {

    @Override
    public Propietario mapRow(ResultSet rs, int rowNum) throws SQLException {
        Propietario propietario = new Propietario();
        propietario.setId(rs.getInt("idpropietario"));
        propietario.setNombre(rs.getString("nombre"));
        propietario.setDireccion(rs.getString("direccion"));
        propietario.setTelefono(rs.getString("telefono"));
        propietario.setCorreo(rs.getString("correo"));
        propietario.setComentarios(rs.getString("comentarios"));

        return propietario;
    }
}