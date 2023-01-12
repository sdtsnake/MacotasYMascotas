package work.oscarramos.mascotas.mappers;

import org.springframework.stereotype.Component;
import work.oscarramos.mascotas.dto.PropietarioDto;
import work.oscarramos.mascotas.models.Propietario;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class PropietarioMapper {

    public List<PropietarioDto> toDto(List<Propietario> propietario) {
        return propietario.stream()
                .map(m -> new PropietarioDto(m.getId(),
                        m.getNombre().trim(),
                        m.getDireccion().trim(),
                        m.getTelefono().trim(),
                        m.getCorreo().trim(),
                        m.getComentarios())).collect(Collectors.toList());
    }

}
