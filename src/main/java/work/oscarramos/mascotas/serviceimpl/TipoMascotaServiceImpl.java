package work.oscarramos.mascotas.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import work.oscarramos.mascotas.dto.TipoMascotaDto;
import work.oscarramos.mascotas.mappers.TipoMascotaMapper;
import work.oscarramos.mascotas.models.TipoMascotaCantidad;
import work.oscarramos.mascotas.respository.TipoMascoteRepository;
import work.oscarramos.mascotas.service.TipoMascotaService;

import java.util.List;

@Service
public class TipoMascotaServiceImpl implements TipoMascotaService {
    @Autowired
    TipoMascoteRepository tipoMascoteRepository;
    @Autowired
    TipoMascotaMapper tipoMascotaMapper;
    @Override
    public List<TipoMascotaDto> nroMascotasPorTipo() {
        List<TipoMascotaCantidad> tipoMascotaCantidadList = tipoMascoteRepository.nroMascotasPorTipo();
        if(tipoMascotaCantidadList.isEmpty()){
            throw new RuntimeException("No hay registros por tipo de mascotas");
        }
        return tipoMascotaMapper.toDto(tipoMascotaCantidadList);
    }
}
