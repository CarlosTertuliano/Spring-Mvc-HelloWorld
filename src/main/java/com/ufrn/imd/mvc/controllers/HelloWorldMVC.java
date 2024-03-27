package com.ufrn.imd.mvc.controllers;

import com.ufrn.imd.mvc.models.Usuario;
import com.ufrn.imd.mvc.service.HelloWorldService;
import com.ufrn.imd.mvc.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldMVC {
    private final HelloWorldService helloWorldService;
    private final UsuarioService usuarioService;

    public HelloWorldMVC(HelloWorldService helloWorldService, UsuarioService usuarioService) {
        this.helloWorldService = helloWorldService;
        this.usuarioService = usuarioService;
    }

    @GetMapping("/hellomvc")
    public String helloWorld(@RequestParam(name = "name", required = false) String name, Model model){
        model.addAttribute("name", helloWorldService.helloMessage(name));
        model.addAttribute("usuario", new Usuario());
        return "hello";
    }

    @PostMapping("/cadastrar")
    public String cadastrarUsuario(Usuario usuario, Model model){
        model.addAttribute("nome", usuario.getNome());
        model.addAttribute("dataNascimento", usuario.getDataNascimento());
        usuarioService.cadastrarUsuario(usuario);

        return "confirmacao";
    }
}
