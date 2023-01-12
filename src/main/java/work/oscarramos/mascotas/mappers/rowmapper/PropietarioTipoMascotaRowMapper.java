package work.oscarramos.mascotas.mappers.rowmapper;

import org.springframework.jdbc.core.RowMapper;
import work.oscarramos.mascotas.models.PropietarioMasMascotas;
import work.oscarramos.mascotas.models.PropietarioTipoMascota;

import java.sql.ResultSet;
import java.sql.SQLException;


public class PropietarioTipoMascotaRowMapper implements RowMapper<PropietarioTipoMascota> {

    @Override
    public PropietarioTipoMascota mapRow(ResultSet rs, int rowNum) throws SQLException {
        PropietarioTipoMascota propietarioMasMascotas = new PropietarioTipoMascota();
        propietarioMasMascotas.setNombre(rs.getString("nombre"));
        propietarioMasMascotas.setDescripcion(rs.getString("descripcion"));
        propietarioMasMascotas.setNroMascotas(rs.getInt("nro_mascotas"));

        return propietarioMasMascotas;
    }
}