package com.examen_daw.examen_t1.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen_daw.examen_t1.entities.CategoriaEntity;
import com.examen_daw.examen_t1.repositories.IBaseRepository;
import com.examen_daw.examen_t1.repositories.ICategoriaRepository;

import jakarta.transaction.Transactional;

@Service
public class CategoriaServiceImpl extends BaseServiceImpl<CategoriaEntity, Long> implements ICategoriaService{
    
    @Autowired
    private ICategoriaRepository categoriaRepository;
    
    public CategoriaServiceImpl(IBaseRepository<CategoriaEntity, Long> baseRepository){
        super(baseRepository);
    }

    @Override
    @Transactional
    public List<CategoriaEntity> findByNombre(String nombre)throws Exception{
        try{
            List<CategoriaEntity> categorias = categoriaRepository.findByNombre(nombre);
            return categorias;
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
