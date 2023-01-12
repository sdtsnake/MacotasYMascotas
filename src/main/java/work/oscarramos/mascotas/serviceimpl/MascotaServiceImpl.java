package work.oscarramos.mascotas.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import work.oscarramos.mascotas.dto.MascotaDto;
import work.oscarramos.mascotas.mappers.MascotaMapper;
import work.oscarramos.mascotas.models.Mascota;
import work.oscarramos.mascotas.respository.MascotaRepository;
import work.oscarramos.mascotas.service.MascotaService;

import java.util.List;

@Service
public class MascotaServiceImpl implements MascotaService {
    @Autowired
    MascotaRepository mascotaRepository;
    @Autowired
    MascotaMapper mascotaMapper;


    @Override
    public List<MascotaDto> EncontrarTodos() {
        List<Mascota> mascotasList = mascotaRepository.todasMascotas();
        if(mascotasList.isEmpty()){
            throw new RuntimeException("No hay mascotas para consultar");
        }
        return mascotaMapper.toDto(mascotasList);
    }

    @Override
    public List<MascotaDto> EncontrarSinPropietarios() {
        List<Mascota> mascotasList = mascotaRepository.mascotasSinPropietario();
        if(mascotasList.isEmpty()){
            throw new RuntimeException("No hay mascotas sin propietario para consultar");
        }
        return mascotaMapper.toDto(mascotasList);
    }


}
