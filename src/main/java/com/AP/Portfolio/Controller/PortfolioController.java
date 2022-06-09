//RUTAS
package com.AP.Portfolio.Controller;

import com.AP.Portfolio.Model.Usuario;
import com.AP.Portfolio.Service.InterUsuarioService;
import java.util.List;
import com.github.cliftonlabs.json_simple.JsonObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = {"http://localhost:4200", "https://diegosalvana-ap.web.app/"})
@RequestMapping("/api")
public class PortfolioController {

    @Autowired
    public InterUsuarioService usuarioService;

    @GetMapping("/usuario")
    @ResponseBody
    public List<Usuario> verUsuarios() {
        return usuarioService.verUsuarios();
    }

    @PostMapping("/usuario/nuevo")
    public void guardarUsuario(@RequestBody Usuario usuario) {
        usuarioService.guardarUsuario(usuario);
    }

    @DeleteMapping("/usuario/eliminar/{id}")
    public void eliminarUsuario(@PathVariable Long id) {
        usuarioService.eliminarUsuario(id);
    }

    //Verificación
    @PostMapping("/usuario")
    public JsonObject verificarUsuario(@RequestBody Usuario usuario) {
        JsonObject jsonVerdadero = new JsonObject();
        JsonObject jsonFalso = new JsonObject();
        
        jsonVerdadero.put("Verificacion", "VERDADERO");
        jsonVerdadero.put("token", "JWT");
        jsonFalso.put("Verificacion", "FALSO");
        
        if (usuarioService.verificacionUsuario(usuario)) return jsonVerdadero;
        
        return jsonFalso;
               
    }

}
