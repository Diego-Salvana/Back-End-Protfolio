package com.AP.Portfolio.Service;

import com.AP.Portfolio.Model.Educacion;
import java.util.List;

public interface InterEducacionService {

    public List<Educacion> obtenerEducacion();

    public void agregarEducacion(Educacion itemEducacion);

    public void modificarEducacion(Educacion itemEducacion);

    public void eliminarEducacion(Long id);

}
