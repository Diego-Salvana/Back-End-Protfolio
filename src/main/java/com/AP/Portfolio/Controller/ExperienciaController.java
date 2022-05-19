package com.AP.Portfolio.Controller;

import com.AP.Portfolio.Model.ExperienciaLaboral;
import com.AP.Portfolio.Service.ExperienciaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ExperienciaController {

    @Autowired
    ExperienciaService expSvc;

    @GetMapping("/api/experiencia")
    @ResponseBody
    public List<ExperienciaLaboral> obtenerExperiencias() {
        return expSvc.obtenerExperiencia();
    }

    ;
    
    @PostMapping("/api/experiencia")
    public void agregarModificarExperiencia(@RequestBody ExperienciaLaboral itemExperiencia) {
        expSvc.agregarModificarExperiencia(itemExperiencia);
    }

    @DeleteMapping("/api/experiencia/{id}")
    public void eliminarExperiencia(@PathVariable int id) {
        expSvc.eliminarExperiencia(id);
    }

}
