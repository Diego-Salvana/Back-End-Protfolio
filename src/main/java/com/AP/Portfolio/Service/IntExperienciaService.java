package com.AP.Portfolio.Service;

import com.AP.Portfolio.Model.ExperienciaLaboral;
import java.util.List;

public interface IntExperienciaService {

    public List<ExperienciaLaboral> obtenerExperiencia();

    public void agregarModificarExperiencia(ExperienciaLaboral itemExperiencia);

    public void eliminarExperiencia(int id);

}
