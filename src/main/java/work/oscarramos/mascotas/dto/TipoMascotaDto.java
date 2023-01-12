package work.oscarramos.mascotas.dto;

public class TipoMascotaDto {

    private String tipoMascotaNombre;
    private Integer numeroMascotas;

    public String getTipoMascotaNombre() {
        return tipoMascotaNombre;
    }

    public void setTipoMascotaNombre(String tipoMascotaNombre) {
        this.tipoMascotaNombre = tipoMascotaNombre;
    }

    public Integer getNumeroMascotas() {
        return numeroMascotas;
    }

    public void setNumeroMascotas(Integer numeroMascotas) {
        this.numeroMascotas = numeroMascotas;
    }

    public TipoMascotaDto(String tipoMascotaNombre, Integer numeroMascotas) {
        this.tipoMascotaNombre = tipoMascotaNombre;
        this.numeroMascotas = numeroMascotas;
    }
}
