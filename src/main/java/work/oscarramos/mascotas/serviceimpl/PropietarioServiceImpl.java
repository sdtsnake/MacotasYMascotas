package work.oscarramos.mascotas.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import work.oscarramos.mascotas.dto.PropietarioDto;
import work.oscarramos.mascotas.dto.PropietarioMasMascotasDto;
import work.oscarramos.mascotas.dto.PropietarioMascotasTipoDto;
import work.oscarramos.mascotas.mappers.PropietarioMapper;
import work.oscarramos.mascotas.mappers.PropietarioMasMascotasMapper;
import work.oscarramos.mascotas.mappers.PropietarioTipoMascotaMapper;
import work.oscarramos.mascotas.models.Propietario;
import work.oscarramos.mascotas.models.PropietarioMasMascotas;
import work.oscarramos.mascotas.models.PropietarioTipoMascota;
import work.oscarramos.mascotas.respository.PropietarioRepository;
import work.oscarramos.mascotas.service.PropietarioService;

import java.util.List;

@Service
public class PropietarioServiceImpl implements PropietarioService {
    @Autowired
    PropietarioRepository propietarioRepository;
    @Autowired
    PropietarioMasMascotasMapper propietarioMasMascotasMapper;
    @Autowired
    PropietarioTipoMascotaMapper propietarioTipoMascotaMapper;
    @Autowired
    PropietarioMapper propietarioMapper;

    @Override
    public List<PropietarioMasMascotasDto> propietarioConMascotas() {
        List<PropietarioMasMascotas> propietarioMasMascotasList = propietarioRepository.propitarioConMascotas();
        if(propietarioMasMascotasList.isEmpty()){
            throw new RuntimeException("No existen propietarios con mas de una mascota");
        }

        return propietarioMasMascotasMapper.toDto(propietarioMasMascotasList);
    }

    @Override
    public List<PropietarioMascotasTipoDto> propietarioTipoMascota() {
        List<PropietarioTipoMascota> propietarioTipoMascotaList = propietarioRepository.propietarioPorTipoMascotas();
        if(propietarioTipoMascotaList.isEmpty()){
            throw new RuntimeException("No existen propietarios con mascotas en adopcion");
        }

        return propietarioTipoMascotaMapper.toDto(propietarioTipoMascotaList);
    }

    @Override
    public List<PropietarioDto> propietarioSinMascotas() {
        List<Propietario> propietarioList = propietarioRepository.PropietarioSinMacotas();
        if(propietarioList.isEmpty()){
            throw new RuntimeException("No existen propietarioList sin mascota asignada");
        }
        return propietarioMapper.toDto(propietarioList);
    }
}
