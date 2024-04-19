package com.examen_daw.examen_t1.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.examen_daw.examen_t1.entities.CategoriaEntity;
import com.examen_daw.examen_t1.services.CategoriaServiceImpl;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/categorias")
public class CategoriaController extends BaseControllerImpl<CategoriaEntity, CategoriaServiceImpl>{

    @GetMapping("/findByNombre")
    public ResponseEntity<?> findByNombre(@RequestParam String nombre ){
        try{
            return ResponseEntity.status(HttpStatus.OK). body(servicio.findByNombre(nombre));
        }
        catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error:\":\"Error. Por favor intente mas tarde.\"}");
    }
}
}