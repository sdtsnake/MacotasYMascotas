package work.oscarramos.mascotas.service;

import work.oscarramos.mascotas.dto.TipoMascotaDto;
import work.oscarramos.mascotas.models.TipoMascotaCantidad;

import java.util.List;

public interface TipoMascotaService {
    List<TipoMascotaDto> nroMascotasPorTipo();
}
