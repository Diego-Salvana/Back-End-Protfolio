
package com.AP.Portfolio.Service;

import com.AP.Portfolio.Model.Educacion;
import com.AP.Portfolio.Repository.EducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionService implements InterEducacionService{
    
    @Autowired
    public EducacionRepository educacionRepository;

    @Override
    public List<Educacion> obtenerEducacion() {
        return educacionRepository.findAll();
    }

    @Override
    public void agregarEducacion(Educacion itemEducacion) {
        educacionRepository.save(itemEducacion);
    }

    @Override
    public void modificarEducacion(Educacion itemEducacion) {
        educacionRepository.save(itemEducacion);
    }

    @Override
    public void eliminarEducacion(Long id) {
        educacionRepository.deleteById(id);
    }
    
}
