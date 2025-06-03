package org.example;

public class Animal {
    private String nombre;
    private String genero;
    private String tipo;

    public Animal(String nombre, String genero, String tipo) {
        this.nombre = nombre;
        this.genero = genero;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
