package com.example.areaTriangulo.model;

public class Triangulo {
    
    private int id;
    private String nombre;
    private double base;
    private double altura;

    public Triangulo(int id, String nombre, double base, double altura) {
        this.id = id;
        this.nombre = nombre;
        this.base = base;
        this.altura = altura;
    }

    public Triangulo() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
    
    
}
