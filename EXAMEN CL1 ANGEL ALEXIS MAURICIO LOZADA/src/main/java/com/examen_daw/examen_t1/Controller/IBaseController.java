package com.examen_daw.examen_t1.Controller;

import java.io.Serializable;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.examen_daw.examen_t1.entities.BaseEntity;

public interface IBaseController <E extends BaseEntity, ID extends Serializable>{
    
    public ResponseEntity<?> getAll();

    public ResponseEntity<?> getOne(@PathVariable ID id);

    public ResponseEntity<?>  save(@RequestBody E entity);

    public ResponseEntity<?>  Update(@PathVariable ID id, @RequestBody E entity);
    
    public ResponseEntity<?>  delete(@PathVariable ID id);
}
