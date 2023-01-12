package work.oscarramos.mascotas.dto;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;


public class MascotaDto {
    @Id
    @Column("idmascota")
    private Integer id;
    private String nombre;
    @Column("tipo_mascota")
    private Integer tipoMascota;
    private Integer propietario;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getTipoMascota() {
        return tipoMascota;
    }

    public void setTipoMascota(Integer tipoMascota) {
        this.tipoMascota = tipoMascota;
    }

    public Integer getPropietario() {
        return propietario;
    }

    public void setPropietario(Integer propietario) {
        this.propietario = propietario;
    }
    public MascotaDto(Integer id, String nombre, Integer tipoMascota, Integer propietario) {
        this.id = id;
        this.nombre = nombre;
        this.tipoMascota = tipoMascota;
        this.propietario = propietario;
    }
}
