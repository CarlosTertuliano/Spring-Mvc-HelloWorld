package com.ufrn.imd.mvc.service;

import com.ufrn.imd.mvc.DAO.UsuarioDAO;
import com.ufrn.imd.mvc.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    private UsuarioDAO usuarioDAO;

    public UsuarioService(){
        this.usuarioDAO = new UsuarioDAO();
    }

    public void cadastrarUsuario(Usuario usuario){
        usuarioDAO.adicionarUsuario(usuario);
    }
}
