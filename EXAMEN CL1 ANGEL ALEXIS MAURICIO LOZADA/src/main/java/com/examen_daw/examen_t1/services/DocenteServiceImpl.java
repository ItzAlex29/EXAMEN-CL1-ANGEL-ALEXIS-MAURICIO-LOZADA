package com.examen_daw.examen_t1.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen_daw.examen_t1.entities.DocenteEntity;
import com.examen_daw.examen_t1.repositories.IBaseRepository;
import com.examen_daw.examen_t1.repositories.IDocenteRepository;

@Service
public class DocenteServiceImpl extends BaseServiceImpl<DocenteEntity, Long> implements IDocenteService{

    @Autowired
    private IDocenteRepository docenteRepository;

    public DocenteServiceImpl(IBaseRepository<DocenteEntity, Long> baseRepository){
        super(baseRepository);
    }
}
