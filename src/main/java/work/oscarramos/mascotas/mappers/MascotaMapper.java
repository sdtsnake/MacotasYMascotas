package work.oscarramos.mascotas.mappers;

import org.springframework.stereotype.Component;
import work.oscarramos.mascotas.dto.MascotaDto;
import work.oscarramos.mascotas.models.Mascota;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class MascotaMapper {
    public List<MascotaDto> toDto(List<Mascota> mascota) {
        return mascota.stream()
                .map(m -> new MascotaDto(m.getId(),
                        m.getNombre().trim(),
                        m.getTipoMascota(),
                        m.getPropietario())).collect(Collectors.toList());
    }
}
