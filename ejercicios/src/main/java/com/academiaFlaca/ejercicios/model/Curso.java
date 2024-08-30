package com.academiaFlaca.ejercicios.model;

import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Curso {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long id_curso;
    private String nombre;
    private String modalidad;
    private String fecha_finalizacion;
    @OneToMany 
    private List<Tema> listaTemas;
    
    public Curso(){
    }

    public Curso(Long id_curso, String nombre, String modalidad, String fecha_finalizacion, List<Tema> listaTemas) {
        this.id_curso = id_curso;
        this.nombre = nombre;
        this.modalidad = modalidad;
        this.fecha_finalizacion = fecha_finalizacion;
        this.listaTemas = listaTemas;
    }
    
    
}
