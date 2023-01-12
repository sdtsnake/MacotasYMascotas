package work.oscarramos.mascotas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import work.oscarramos.mascotas.dto.*;
import work.oscarramos.mascotas.service.MascotaService;
import work.oscarramos.mascotas.service.PropietarioService;
import work.oscarramos.mascotas.service.TipoMascotaService;

import java.util.List;

@RequestMapping(value = "/api")
@RestController
public class MascotaController {

    @Autowired
    private MascotaService mascotaService;

    @Autowired
    private TipoMascotaService tipoMascotaService;

    @Autowired
    private PropietarioService propietarioService;

    @GetMapping("mascotas/todas")
    public ResponseEntity<List<MascotaDto>> consultarTodos(){
        try{
            return ResponseEntity.ok(mascotaService.EncontrarTodos());
        }catch (Exception ex){
            return ResponseEntity.badRequest().build();
        }
    }

    @GetMapping("mascotas/sin/propietario")
    public ResponseEntity<List<MascotaDto>> consultar(){
        try{
            return ResponseEntity.ok(mascotaService.EncontrarSinPropietarios());
        }catch (Exception ex){
            return ResponseEntity.badRequest().build();
        }
    }

    @GetMapping("tipo/mascota")
    public ResponseEntity<List<TipoMascotaDto>> consultarTipoMascota(){
        try{
            return ResponseEntity.ok(tipoMascotaService.nroMascotasPorTipo());
        }catch (Exception ex){
            return ResponseEntity.badRequest().build();
        }
    }

    @GetMapping("propietario/Mas/Mascotas")
    public ResponseEntity<List<PropietarioMasMascotasDto>> consultaPropietarioMasMascotas(){
        try{
            return ResponseEntity.ok(propietarioService.propietarioConMascotas());
        }catch (Exception ex){
            return ResponseEntity.badRequest().build();
        }
    }

    @GetMapping("propietario/Tipo/Mascotas")
    public ResponseEntity<List<PropietarioMascotasTipoDto>> consultaPropietarioTipoMascota(){
        try{
            return ResponseEntity.ok(propietarioService.propietarioTipoMascota());
        }catch (Exception ex){
            return ResponseEntity.badRequest().build();
        }
    }

    @GetMapping("propietario/Sin/Mascotas")
    public ResponseEntity<List<PropietarioDto>> consultaPropietarioSinMascota(){
        try{
            return ResponseEntity.ok(propietarioService.propietarioSinMascotas());
        }catch (Exception ex){
            return ResponseEntity.badRequest().build();
        }
    }
}
