package com.examen_daw.examen_t1.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.examen_daw.examen_t1.entities.CategoriaEntity;

@Repository
public interface ICategoriaRepository extends IBaseRepository<CategoriaEntity, Long>{

    //metodo JPQL
    @Query("SELECT c FROM CategoriaEntity c WHERE c.name = :nombre")
    List<CategoriaEntity> findByNombre(String nombre);
    
}
