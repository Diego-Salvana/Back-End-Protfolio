package com.AP.Portfolio.Service;

import com.AP.Portfolio.Model.Usuario;
import java.util.List;

public interface InterUsuarioService {

    public List<Usuario> verUsuarios();

    public void guardarUsuario(Usuario usuario);

    public void eliminarUsuario(Long id);
    
    public boolean verificacionUsuario(Usuario usuario);

}
