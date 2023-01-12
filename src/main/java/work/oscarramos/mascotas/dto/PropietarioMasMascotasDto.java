package work.oscarramos.mascotas.dto;

import work.oscarramos.mascotas.models.Propietario;

public class PropietarioMasMascotasDto{

    private Integer id;
    private String nombre;
    private String direccion;
    private String telefono;
    private String correo;
    private String comentarios;
    private Integer nroMascotas;

    public PropietarioMasMascotasDto(Integer id, String nombre, String direccion, String telefono, String correo, String comentarios, Integer nroMascotas) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
        this.comentarios = comentarios;
        this.nroMascotas = nroMascotas;
    }

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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public Integer getNroMascotas() {
        return nroMascotas;
    }

    public void setNroMascotas(Integer nroMascotas) {
        this.nroMascotas = nroMascotas;
    }
}
