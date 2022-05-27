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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "https://diegosalvana-ap.web.app")
public class EducacionController {

    @Autowired
    public InterEducacionService educacionService;

    @GetMapping("/api/educacion")
    @ResponseBody
    public List<Educacion> obtenerEducacion() {
        return educacionService.obtenerEducacion();
    }

    @PostMapping("/api/agregareducacion")
    public void agregarEducacion(@RequestBody Educacion itemEducacion) {
        educacionService.agregarEducacion(itemEducacion);
    }

    @PostMapping("/api/modificareducacion")
    public void modificarEducacion(@RequestBody Educacion itemEducacion) {
        educacionService.agregarEducacion(itemEducacion);
    }

    @DeleteMapping("/api/eliminareducacion/{id}")
    public void eliminarEducacion(@PathVariable Long id) {
        educacionService.eliminarEducacion(id);
    }

}
