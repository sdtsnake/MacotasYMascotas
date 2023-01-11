package work.oscarramos.mascotas.respository;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import work.oscarramos.mascotas.dto.PropietarioMasMascotasDto;
import work.oscarramos.mascotas.dto.PropietarioMascotasTipoDto;
import work.oscarramos.mascotas.models.Propietario;

public interface PropietarioRepository extends CrudRepository<Propietario, Integer> {

    @Query("SELECT p.idpropietario, p.nombre, p.direccion, p.telefono, p.correo, p.comentarios, count(*) as nro_mascotas_propietario\n" +
            "FROM propietario as p,mascota as m where p.idpropietario = m.propietario GROUP BY p.idpropietario HAVING COUNT(*) > 1;")
    public PropietarioMasMascotasDto propitarioConMascotas();

    @Query("SELECT p.nombre, tm.descripcion, count(*) AS nro_mascotas \n" +
            "FROM tipo_mascota AS tm, mascota AS m, propietario AS p \n" +
            "where tm.idtipo_mascota = m.tipo_mascota and p.idpropietario = m.propietario  \n" +
            "GROUP BY p.nombre, tm.idtipo_mascota, tm.descripcion; \n")
    public PropietarioMascotasTipoDto propietarioPorTipoMascotas();

    @Query("SELECT * \n" +
            "FROM propietario \n" +
            "where propietario.idpropietario not in(select distinct mascota.propietario from mascota where mascota.propietario is not null)")
    public Propietario PropietarioSinMacotas();










}
