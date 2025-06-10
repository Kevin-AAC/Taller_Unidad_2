package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonasPrincipal {
    Scanner scanner = new Scanner(System.in);
    private List<Persona> personas = new ArrayList<>();

    public void AgregarPersona() {

        System.out.println("============================================================");
        System.out.println("Registro de Personas");
        System.out.println("Escriba salir en nombre para terminar los registros ");
        System.out.println("************************************************************");
        while (true){
            System.out.println("Ingrese un Nombre: ");
            String nombre = scanner.nextLine();
            if (nombre.equalsIgnoreCase("salir")) break;
            System.out.println("Ingrese un Apellido: ");
            String apellido = scanner.nextLine();
            System.out.println("Ingrese un Edad: ");
            int edad = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Ingrese un Genero: ");
            String genero = scanner.nextLine();
            System.out.println("Sueldo por Hora:");
            int sueldo_hora = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Cargo:");
            String cargo = scanner.nextLine();
            personas.add(new Persona(nombre,apellido,edad,genero,sueldo_hora, cargo));
            System.out.println("✅ Persona agregada correctamente.\n");
        }



    }
    public void MostrarPersonas() {
        System.out.println("\nLista de personas registradas:");
        for (Persona persona : personas) {
            System.out.println(persona);
        }
    }
    public void CantidadPersonas() {
        System.out.println("\nTotal de personas registradas: " + personas.size());
    }
    public void PromedioEdadPersona() {
        int sumaEdad = 0;
        for(Persona p : personas) {
            sumaEdad += p.getEdad();
        }
        double promedio = (double) sumaEdad / personas.size();
        System.out.println("La edad promedio es:"+ promedio);

    }
    public void MayoresDeEdadPersona() {
        int sumaEdad = 0;
        for(Persona p : personas) {
            if(p.getEdad() >=18 ) {
                sumaEdad ++;
            }
        }
        System.out.println("Numero de mayores de edad: "+ sumaEdad);
    }
    public void PersonasConInicialA(){
        for (Persona persona : personas) {
            if (persona.getNombre().startsWith("A")) {
                System.out.println("Personas cuyos nombres empiecen con “A”: \n " + persona.getNombre() +" "+ persona.getApellido());
            }
        }
    }

}
