package com.ufrn.imd.mvc.DAO;

import com.ufrn.imd.mvc.models.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UsuarioDAO {
    List<Usuario> usuarios;

    public UsuarioDAO() {
        this.usuarios = new ArrayList<>();
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void adicionarUsuario(Usuario usuario){
        this.usuarios.add(usuario);
    }
}
