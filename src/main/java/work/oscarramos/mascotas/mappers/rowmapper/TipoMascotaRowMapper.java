package work.oscarramos.mascotas.mappers.rowmapper;

import org.springframework.jdbc.core.RowMapper;
import work.oscarramos.mascotas.models.TipoMascotaCantidad;

import java.sql.ResultSet;
import java.sql.SQLException;


public class TipoMascotaRowMapper implements RowMapper<TipoMascotaCantidad> {
    @Override
    public TipoMascotaCantidad mapRow(ResultSet rs, int rowNum) throws SQLException {
        TipoMascotaCantidad tipoMascotaCantidad = new TipoMascotaCantidad();

        tipoMascotaCantidad.setDescripcion(rs.getString("descripcion"));
        tipoMascotaCantidad.setNroMascotas(rs.getInt("nro_mascotas"));

        return tipoMascotaCantidad;
    }
}
