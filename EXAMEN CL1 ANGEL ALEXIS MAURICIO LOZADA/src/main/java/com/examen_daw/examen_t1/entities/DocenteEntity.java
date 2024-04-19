package com.examen_daw.examen_t1.entities;


import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "docente")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class DocenteEntity extends BaseEntity{

    @Column(columnDefinition = "CHAR(8)")
    private String DNI;
    @Column(name = "fechaNacimiento")
    private Date fechaNacimiento;
    private double sueldo;
    @Column (length = 45)
    private String email;
    @Column (length = 45)
    private String sexo;
    @ManyToOne
    @JoinColumn(name = "idcategoria")
    private CategoriaEntity categoria;
}
