package work.oscarramos.mascotas.models;


import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table
public class Propietario {

    @Id
    @Column("propietario")
    private Integer id;
    private String nombre;
    private String direccion;
    private String telefono;
    private String correo;
    private String comentarios;

}
