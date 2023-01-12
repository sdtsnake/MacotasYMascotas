package work.oscarramos.mascotas.mappers;

import org.springframework.stereotype.Component;
import work.oscarramos.mascotas.dto.TipoMascotaDto;
import work.oscarramos.mascotas.models.TipoMascotaCantidad;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class TipoMascotaMapper {
    public List<TipoMascotaDto> toDto(List<TipoMascotaCantidad> tipoMascotaCantidad) {
        return tipoMascotaCantidad.stream()
                .map(t -> new TipoMascotaDto(t.getDescripcion().trim(),
                        t.getNroMascotas())).collect(Collectors.toList());
    }
}
