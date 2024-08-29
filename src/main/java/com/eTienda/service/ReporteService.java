
package com.eTienda.service;

import java.io.IOException;
import java.util.Map;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;


public interface ReporteService {
    
    public ResponseEntity<Resource>
            generaReporte(String reporte, //El nombre del reporte (usuarios.jasper)
                    Map<String, Object> parametros, //El tipo de reporte que el usuario solicita (pdf,xlsx,csv)
                    String tipo) throws IOException;
}
