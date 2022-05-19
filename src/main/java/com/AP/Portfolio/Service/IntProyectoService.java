package com.AP.Portfolio.Service;

import com.AP.Portfolio.Model.Proyecto;
import java.util.List;

public interface IntProyectoService {

    public List<Proyecto> obtenerProyectos();

    public void agregarModificarProyecto(Proyecto itemExperiencia);

    public void eliminarProyecto(int id);

}
