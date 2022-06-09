package com.AP.Portfolio.Controller;

import com.AP.Portfolio.Model.Proyecto;
import com.AP.Portfolio.Service.ProyectoService;
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
public class ProyectoController {

    @Autowired
    ProyectoService proyectoService;

    @GetMapping("/proyectos")
    @ResponseBody
    public List<Proyecto> obtenerProyecto() {
        return proyectoService.obtenerProyectos();
    }

    @PostMapping("/proyectos")
    public void agregarModificarProyecto(@RequestBody Proyecto itemProyecto) {
        proyectoService.agregarModificarProyecto(itemProyecto);
    }

    @DeleteMapping("/proyectos/{id}")
    public void eliminarProyecto(@PathVariable int id) {
        proyectoService.eliminarProyecto(id);
    }

}
