package com.example.Ingensystem.Model;

import java.io.Serializable;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "usuario")

public class usuario implements Serializable {
    
    private static final long serialVersionUID = 1L;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)      
    
    private Long idUsuario;
    private String nombre;
    private String apellido;
    private String cedula;
    private String password;
    private String rolusuario;
    private String estado;    

}
