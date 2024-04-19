package com.examen_daw.examen_t1.services;


import java.util.List;

import com.examen_daw.examen_t1.entities.CategoriaEntity;

public interface ICategoriaService extends IBaseService<CategoriaEntity, Long>{
    List<CategoriaEntity> findByNombre(String nombre)throws Exception;
    
}
