package com.AP.Portfolio.Controller;

import com.AP.Portfolio.Model.Habilidad;
import com.AP.Portfolio.Service.HabilidadService;
import java.util.List;
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
public class HabilidadController {
    
    @Autowired
    HabilidadService habilidadSvc;
    
    @GetMapping("/habilidades")
    @ResponseBody
    public List<Habilidad> obtenerHabilidades(List<Long> id) {
        return habilidadSvc.findAllById(id);
    }
    
    @PostMapping("/habilidades")
    public void agregarModificarHabilidades(@RequestBody Habilidad itemHabilidad) {
        habilidadSvc.agregarModificarHabilidad(itemHabilidad);
    }
    
    @DeleteMapping("/habilidades/{id}")
    public void eliminarHabilidades(@PathVariable Long id) {
        habilidadSvc.eliminarHabilidad(id);
    }
    
}
