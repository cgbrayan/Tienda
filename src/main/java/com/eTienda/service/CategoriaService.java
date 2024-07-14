
package com.eTienda.service;

import com.eTienda.domain.Categoria;
import java.util.List;


public interface CategoriaService {
    
     //Se obtiene un listado de categorias en un List
    public List<Categoria> getCategorias(boolean activos);
}
