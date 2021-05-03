/*
package dgg.Student.dggMaven2.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.io.Serializable;

//@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="persona")

public class Persona implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    Long id;
    @Nullable
    @Column(name="rut")
    Integer rut;
    @Nullable
    @Column(name="nombre")
    String nombre;

    public Persona(Long id, @Nullable Integer rut, @Nullable String nombre) {
        this.id = id;
        this.rut = rut;
        this.nombre = nombre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Nullable
    public Integer getRut() {
        return rut;
    }

    public void setRut(@Nullable Integer rut) {
        this.rut = rut;
    }

    @Nullable
    public String getNombre() {
        return nombre;
    }

    public void setNombre(@Nullable String nombre) {
        this.nombre = nombre;
    }


}
*/
