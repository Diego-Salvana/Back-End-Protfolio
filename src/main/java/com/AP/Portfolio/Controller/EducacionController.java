package com.AP.Portfolio.Controller;

import com.AP.Portfolio.Model.Educacion;
import com.AP.Portfolio.Service.InterEducacionService;
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
public class EducacionController {

    @Autowired
    public InterEducacionService educacionService;

    @GetMapping("/educacion")
    @ResponseBody
    public List<Educacion> obtenerEducacion() {
        return educacionService.obtenerEducacion();
    }

    @PostMapping("/educacion/agregar")
    public void agregarEducacion(@RequestBody Educacion itemEducacion) {
        educacionService.agregarEducacion(itemEducacion);
    }

    @PostMapping("/educacion/modificar")
    public void modificarEducacion(@RequestBody Educacion itemEducacion) {
        educacionService.agregarEducacion(itemEducacion);
    }

    @DeleteMapping("/educacion/{id}")
    public void eliminarEducacion(@PathVariable Long id) {
        educacionService.eliminarEducacion(id);
    }

}
