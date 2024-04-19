package com.examen_daw.examen_t1.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examen_daw.examen_t1.entities.DocenteEntity;
import com.examen_daw.examen_t1.services.DocenteServiceImpl;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/docentes")
public class DocenteController extends BaseControllerImpl<DocenteEntity, DocenteServiceImpl>{

}
