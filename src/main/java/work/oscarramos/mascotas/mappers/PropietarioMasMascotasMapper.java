package work.oscarramos.mascotas.mappers;

import org.springframework.stereotype.Component;
import work.oscarramos.mascotas.dto.PropietarioMasMascotasDto;
import work.oscarramos.mascotas.models.PropietarioMasMascotas;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class PropietarioMasMascotasMapper {
    public List<PropietarioMasMascotasDto> toDto(List<PropietarioMasMascotas> propietarioMasMascotas) {
        return propietarioMasMascotas.stream()
                .map(p -> new PropietarioMasMascotasDto(p.getId(),
                        p.getNombre().trim(),
                        p.getDireccion().trim(),
                        p.getTelefono().trim(),
                        p.getCorreo(),
                        p.getComentarios(),
                        p.getNroMascotas())).collect(Collectors.toList());
    }
}
