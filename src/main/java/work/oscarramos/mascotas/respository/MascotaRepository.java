package work.oscarramos.mascotas.respository;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import work.oscarramos.mascotas.models.Mascota;

import java.util.List;

@Repository
public interface MascotaRepository extends CrudRepository<Mascota,Integer> {

    @Query("SELECT * FROM mascota")
    List<Mascota> todasMascotas();

    @Query("SELECT * FROM mascota where mascota.propietario is null")
    List<Mascota> mascotasSinPropietario();
}
