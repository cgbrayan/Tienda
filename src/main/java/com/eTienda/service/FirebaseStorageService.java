
package com.eTienda.service;

import org.springframework.web.multipart.MultipartFile;


public interface FirebaseStorageService {
    
    public String cargaImagen(MultipartFile archivoLocalCliente, String carpeta, Long id);
    
    //El BuketName es el <id_del_proyecto> + ".appspot.com"
    final String BucketName = "techshop-58798.appspot.com";
    
    //Esta es la ruta basica de este proyecto TechShop
    final String rutaSuperiorStorage = "techshop";
    
    //Ubicacion donde se encuentra el archivo de configuracion Json
    final String rutaJsonFile = "firebase";
    
    //El nombre del archivo Json
    final String archivoJsonFile = "techshop-58798-firebase-adminsdk-vd5oz-75578b354f.json";
}
