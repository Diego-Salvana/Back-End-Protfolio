package com.AP.Portfolio.Controller;

import com.AP.Portfolio.Model.DatosPersonales;
import com.AP.Portfolio.Service.DatosPersonalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = {"http://localhost:4200", "https://diegosalvana-ap.web.app/"})
@RequestMapping("/api")
public class DatosPersonalesController {

    @Autowired
    DatosPersonalesService datosPersSvc;

    @GetMapping("/datospersonales")
    @ResponseBody
    public DatosPersonales obtenerDatosPersonales() {
        return datosPersSvc.obtenerDatosPersonales();
    }

    @PostMapping("/datospersonales")
    public void modificarDatosPersonales(@RequestBody DatosPersonales datosPers) {
        datosPersSvc.modificarDatosPersonales(datosPers);
    }

}
