package com.example.Ingensystem.Model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import lombok.Data;

@Data
@Entity
@Table(name = "usuario")

public class usuario implements Serializable {
    
    private static final long serialVersionUID = 1L;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)      
    
   
    private Long idUsuario; 

    @NotEmpty
    private String nombre; 
    
    @NotEmpty
    private String apellido;    

    @NotEmpty
    private String cedula; 
    
    @NotEmpty
    private String password; 
    
    @NotEmpty
    private String rolusuario;
    
    @NotEmpty
    private String estado;    

}
