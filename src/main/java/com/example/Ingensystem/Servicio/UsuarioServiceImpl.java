package com.example.Ingensystem.Servicio;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.Ingensystem.DAO.usuarioDao;
import com.example.Ingensystem.Model.usuario;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private usuarioDao UsuarioDao;

    @Override
    @Transactional(readOnly = true)
    public List<usuario> listarUsuarios() {
       return (List<usuario>) UsuarioDao.findAll();    
    }

    @Override
    @Transactional
    public void Guardar(usuario Usuario) {
       UsuarioDao.save(Usuario);
        
    }

    @Override
    @Transactional
    public void Eliminar(usuario Usuario) {
      UsuarioDao.delete(Usuario);
        
    }

    @Override
    @Transactional(readOnly = true)
    public usuario encuentraUsuario(usuario Usuario) {
      
        return UsuarioDao.findById(Usuario.getIdUsuario()).orElse(null);
    }
    
}
