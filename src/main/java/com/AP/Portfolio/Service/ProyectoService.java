
package com.AP.Portfolio.Service;

import com.AP.Portfolio.Model.Proyecto;
import com.AP.Portfolio.Repository.ProyectoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectoService implements IntProyectoService {

    @Autowired
    ProyectoRepository proyectoRepository;
    
    @Override
    public List<Proyecto> obtenerProyectos() {
        return proyectoRepository.findAll();
    }

    @Override
    public void agregarModificarProyecto(Proyecto itemProyecto) {
        proyectoRepository.save(itemProyecto);
    }

    @Override
    public void eliminarProyecto(int id) {
        proyectoRepository.deleteById(id);
    }
    
}
