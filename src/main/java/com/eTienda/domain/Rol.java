package com.eTienda.domain;

import java.io.Serializable;
import lombok.Data;
import jakarta.persistence.*;

@Data
@Entity
@Table(name = "rol")
public class Rol implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_rol")

    private Long idRol;
    private String nombre;

    //@Column(name = "id_usuario")   [***] 
    //private Long idUsuario;   [***]  
    //Uso ManyToOne para establecer la relacion con usuario de manera adecuada   [***]  
    @ManyToOne
    @JoinColumn(name = "id_usuario") //Es una FK
    private Usuario usuario;
}
