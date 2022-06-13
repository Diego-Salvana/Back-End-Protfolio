package com.AP.Portfolio.Service;

import com.AP.Portfolio.Model.Habilidad;
import com.AP.Portfolio.Repository.HabilidadRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HabilidadService implements InterHabilidadService {

    @Autowired
    HabilidadRepository habilidadRepository;

    @Override
    public List<Habilidad> obtenerHabilidades() {
        return habilidadRepository.findAll();
    }

    @Override
    public void agregarModificarHabilidad(Habilidad itemHabilidad) {
        habilidadRepository.save(itemHabilidad);
    }

    @Override
    public void eliminarHabilidad(Long id) {
        habilidadRepository.deleteById(id);
    }

}
