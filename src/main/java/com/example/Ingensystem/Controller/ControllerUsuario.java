package com.example.Ingensystem.Controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.Ingensystem.Model.usuario;
import com.example.Ingensystem.Servicio.UsuarioService;


import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class ControllerUsuario {

    @Autowired // Para las dependencias.. Uso de memoria o cantidad de registros
    private UsuarioService UserService;

    @GetMapping("/")
    public String inicio(Model model) {
        var usuarios = UserService.listarUsuarios();
        var mensaje = "Por fin funciona con service";

        log.info("ejecutando el controlador Spring MVC");
        model.addAttribute("mensaje", mensaje);
        model.addAttribute("usuarios", usuarios);// Donde se guarda la consulta y "" el nombre
        return "usuario";

    }

    @GetMapping("/agregar") // direccionamiento a la pagina agregar
    public String agregar(usuario Usuario) {
        return "agregar";
    }

    @PostMapping("/guardar") // Guarda y vuelve a la pagina
    public String guardar(@Valid usuario Usuario, Errors errors) {
        UserService.Guardar(Usuario);
        return "redirect:/";
    }

    @GetMapping("/editar/{idUsuario}") // direccionamiento a editar
    public String editar(usuario Usuario, Model Model) {
        Usuario = UserService.encuentraUsuario(Usuario);
        Model.addAttribute("usuario", Usuario);
        return "agregar";
    }

    @GetMapping("/eliminar")// direccionamiento a eliminar con el idUsuario
    public String eliminar(usuario Usuario) {
        UserService.Eliminar(Usuario);
        return "redirect:/";

    }

}
