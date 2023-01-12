package work.oscarramos.mascotas.service;

import work.oscarramos.mascotas.dto.PropietarioDto;
import work.oscarramos.mascotas.dto.PropietarioMasMascotasDto;
import work.oscarramos.mascotas.dto.PropietarioMascotasTipoDto;

import java.util.List;

public interface PropietarioService {

    List<PropietarioMasMascotasDto> propietarioConMascotas();
    List<PropietarioMascotasTipoDto> propietarioTipoMascota();
    List<PropietarioDto> propietarioSinMascotas();


}
