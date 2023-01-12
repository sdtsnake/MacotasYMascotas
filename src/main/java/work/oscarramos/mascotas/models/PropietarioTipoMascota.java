package work.oscarramos.mascotas.models;

public class PropietarioTipoMascota {
    private String nombre;
    private String descripcion;
    private Integer nroMascotas;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getNroMascotas() {
        return nroMascotas;
    }

    public void setNroMascotas(Integer nroMascotas) {
        this.nroMascotas = nroMascotas;
    }
}
