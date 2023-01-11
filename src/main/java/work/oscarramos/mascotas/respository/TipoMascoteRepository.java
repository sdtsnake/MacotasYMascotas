package work.oscarramos.mascotas.respository;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import work.oscarramos.mascotas.dto.TipoMascotaDto;
import work.oscarramos.mascotas.models.TipoMascota;

@Repository
public interface TipoMascoteRepository extends CrudRepository<TipoMascota,Integer> {

    @Query("SELECT tm.descripcion, count(tm.idtipo_mascota) AS nro_mascotas \n" +
            "FROM tipo_mascota AS tm, mascota AS m \n" +
            "where tm.idtipo_mascota = m.tipo_mascota GROUP BY tm.idtipo_mascota, tm.descripcion; ")
    public TipoMascotaDto nroMascotasPorTipo();
}
