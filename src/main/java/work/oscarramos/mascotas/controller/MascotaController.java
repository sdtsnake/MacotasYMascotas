package work.oscarramos.mascotas.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import work.oscarramos.mascotas.dto.MascotaDto;
import work.oscarramos.mascotas.service.MascotaService;

import java.util.List;

@RequestMapping(value = "/api/mascotas")
@RestController
public class MascotaController {
    private final MascotaService mascotaService;

    @GetMapping()
    public ResponseEntity<List<MascotaDto>> consultar(){
        try{
            return ResponseEntity.ok(mascotaService.EncontrarTodos());
        }catch (Exception ex){
            return ResponseEntity.badRequest().build();
        }
    }
    public MascotaController(MascotaService mascotaService) {
        this.mascotaService = mascotaService;
    }
}
