package com.AP.Portfolio.Service;

import com.AP.Portfolio.Model.Usuario;
import com.AP.Portfolio.Repository.UsuarioReposotory;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService implements InterUsuarioService {

    @Autowired
    public UsuarioReposotory usuarioReposotory;

    @Override
    public List<Usuario> verUsuarios() {
        return usuarioReposotory.findAll();
    }

    @Override
    public void guardarUsuario(Usuario usuario) {
        usuarioReposotory.save(usuario);
    }

    @Override
    public void eliminarUsuario(Long id) {
        usuarioReposotory.deleteById(id);
    }

    @Override
    public boolean verificacionUsuario(Usuario usuario) {
        Usuario registro = usuarioReposotory.findById(usuario.getId()).orElse(null);

        String valor1 = usuario.getUsuario();
        String valor2 = usuario.getContrasena();
        String valor3 = registro.getUsuario();
        String valor4 = registro.getContrasena();

        if (!valor1.equals(valor3)) return false;
        return valor2.equals(valor4);
    }

}
