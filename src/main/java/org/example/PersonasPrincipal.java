package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonasPrincipal {
    Scanner scanner = new Scanner(System.in);
    private List<Persona> personas = new ArrayList<>();


    public void AgregarPersona() {
        System.out.println("Ingrese un Nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese un Apellido: ");
        String apellido = scanner.nextLine();
        System.out.println("Ingrese un Edad: ");
        int edad = scanner.nextInt();
        System.out.println("Ingrese un Genero: ");
        String genero = scanner.nextLine();
        System.out.println("Sueldo por Hora:");
        int sueldo_hora = scanner.nextInt();
        System.out.println("Cargo:");
        String cargo = scanner.nextLine();
        personas.add(new Persona(nombre,apellido,edad,genero,sueldo_hora, cargo));
        System.out.println("✅ Persona agregada correctamente.\n");

    }
    public void MostrarPersonas() {
        System.out.println("\n📋 Lista de personas registradas:");
        for (Persona persona : personas) {
            System.out.println(persona);
        }
    }

}
