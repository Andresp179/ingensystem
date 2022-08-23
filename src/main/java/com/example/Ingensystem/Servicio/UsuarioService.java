package com.example.Ingensystem.Servicio;

import java.util.List;
import com.example.Ingensystem.Model.usuario;

public interface UsuarioService {

    public List<usuario> listarUsuarios();

    public void Guardar(usuario Usuario);

    public void Eliminar(usuario Usuario);

    public usuario encuentraUsuario(usuario Usuario);

    
}
