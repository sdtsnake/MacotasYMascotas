package work.oscarramos.mascotas.models;


public class TipoMascotaCantidad {
    private String descripcion;
    private Integer nroMascotas;
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
