package work.oscarramos.mascotas.dto;

public class PropietarioMascotasTipoDto {
    private String nombrePropietario;
    private String tipoMascotaNombre;
    private Integer nroMascotasTipo;

    public PropietarioMascotasTipoDto(String nombrePropietario, String tipoMascotaNombre, Integer nroMascotasTipo) {
        this.nombrePropietario = nombrePropietario;
        this.tipoMascotaNombre = tipoMascotaNombre;
        this.nroMascotasTipo = nroMascotasTipo;
    }

    public String getNombrePropietario() {
        return nombrePropietario;
    }

    public void setNombrePropietario(String nombrePropietario) {
        this.nombrePropietario = nombrePropietario;
    }

    public String getTipoMascotaNombre() {
        return tipoMascotaNombre;
    }

    public void setTipoMascotaNombre(String tipoMascotaNombre) {
        this.tipoMascotaNombre = tipoMascotaNombre;
    }

    public Integer getNroMascotasTipo() {
        return nroMascotasTipo;
    }

    public void setNroMascotasTipo(Integer nroMascotasTipo) {
        this.nroMascotasTipo = nroMascotasTipo;
    }
}
