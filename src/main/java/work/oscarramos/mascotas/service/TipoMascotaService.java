package work.oscarramos.mascotas.service;

import work.oscarramos.mascotas.dto.TipoMascotaDto;
import work.oscarramos.mascotas.models.TipoMascota;

public interface TipoMascotaService {
    TipoMascotaDto nroMascotasPorTipo(TipoMascota mascota);
}
