package com.AP.Portfolio.Service;

import com.AP.Portfolio.Model.ExperienciaLaboral;
import com.AP.Portfolio.Repository.ExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaService implements IntExperienciaService {

    @Autowired
    ExperienciaRepository expRepo;
    
    @Override
    public List<ExperienciaLaboral> obtenerExperiencia() {
        return expRepo.findAll();
    }

    @Override
    public void agregarModificarExperiencia(ExperienciaLaboral itemExperiencia) {
        expRepo.save(itemExperiencia);
    }
    
    @Override
    public void eliminarExperiencia(int id) {
        expRepo.deleteById(id);
    }

}
