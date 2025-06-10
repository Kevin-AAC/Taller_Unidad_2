package org.example;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private String genero;
    private int sueldoHora;
    private String cargo;

    public Persona(String nombre, String apellido,int edad, String genero,int sueldoHora,String cargo) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.sueldoHora = sueldoHora;
        this.genero = genero;
        this.edad = edad;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getSueldoHora() {
        return sueldoHora;
    }

    public void setSueldoHora(int sueldoHora) {
        this.sueldoHora = sueldoHora;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    @Override
    public String toString() {
        return nombre + " " + apellido + ", Edad: " + edad + ", Género: " + genero + ", Sueldo/Hora: $" + sueldoHora + ", Cargo: " + cargo;
    }
}
