package work.oscarramos.mascotas.service;

import work.oscarramos.mascotas.dto.MascotaDto;
import work.oscarramos.mascotas.models.Mascota;

import java.util.List;

public interface MascotaService {
    List<MascotaDto> EncontrarTodos();
    List<MascotaDto> EncontrarSinPropietarios();
}
