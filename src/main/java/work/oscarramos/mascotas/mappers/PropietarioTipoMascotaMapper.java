package work.oscarramos.mascotas.mappers;

import org.springframework.stereotype.Component;
import work.oscarramos.mascotas.dto.PropietarioMascotasTipoDto;
import work.oscarramos.mascotas.models.PropietarioTipoMascota;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class PropietarioTipoMascotaMapper {
    public List<PropietarioMascotasTipoDto> toDto(List<PropietarioTipoMascota> propietarioTipoMascotas) {
        return propietarioTipoMascotas.stream()
                .map(p -> new PropietarioMascotasTipoDto(p.getNombre().trim(),
                        p.getDescripcion().trim(),
                        p.getNroMascotas())).collect(Collectors.toList());
    }
}
