package work.oscarramos.mascotas.service;

import work.oscarramos.mascotas.dto.MascotaDto;
import work.oscarramos.mascotas.models.Mascota;

public interface MascotaService {
    MascotaDto EncontrarTodos(Mascota mascota);
    MascotaDto EncontrarSinPropietarios(Mascota mascota);
}
