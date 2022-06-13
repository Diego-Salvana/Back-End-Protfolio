package com.AP.Portfolio.Service;

import com.AP.Portfolio.Model.Habilidad;
import java.util.List;

public interface InterHabilidadService {

    public List<Habilidad> obtenerHabilidades();

    public void agregarModificarHabilidad(Habilidad itemHabilidad);

    public void eliminarHabilidad(Long id);

}
