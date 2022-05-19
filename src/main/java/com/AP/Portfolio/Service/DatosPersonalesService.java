
package com.AP.Portfolio.Service;

import com.AP.Portfolio.Model.DatosPersonales;
import com.AP.Portfolio.Repository.DatosPersonalesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DatosPersonalesService implements IntDatosPersonalesService {

    @Autowired
    DatosPersonalesRepository datosPersRepo;
    
    @Override
    public DatosPersonales obtenerDatosPersonales() {
        return datosPersRepo.findById(1).orElse(null);
    }

    @Override
    public void modificarDatosPersonales(DatosPersonales datosPers) {
        datosPersRepo.save(datosPers);
    }
    
    
    
}
