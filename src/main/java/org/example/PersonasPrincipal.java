package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
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
        System.out.println("====================================");
    }
    public void CantidadPersonas() {
        System.out.println("\nTotal de personas registradas: " + personas.size());
        System.out.println("====================================");
    }
    public void PromedioEdadPersona() {
        int sumaEdad = 0;
        for(Persona p : personas) {
            sumaEdad += p.getEdad();
        }
        double promedio = (double) sumaEdad / personas.size();
        System.out.printf("La edad promedio es: %.2f%n", promedio);
        System.out.println("====================================");

    }
    public void MayoresDeEdadPersona() {
        long mayores = personas.stream()
                .filter(persona -> persona.getEdad() > 18)
                .count();
        System.out.println("Numero de mayores de edad: "+ mayores);
        System.out.println("====================================");
    }
    public void PersonasConInicialA(){
        System.out.println("Personas cuyos nombres empiecen con “A”:");
        personas.stream()
                .filter(persona -> persona.getNombre().startsWith("A"))
                .forEach(persona -> System.out.println(persona.getNombre() + " " + persona.getApellido()));
        System.out.println("====================================");
    }

    public void ApellidosContenganM(){
        System.out.println("Personas cuyos apellidos contengan “M”:");
        personas.stream()
                .filter(persona -> persona.getApellido().contains("m"))
                .forEach(persona -> System.out.println(persona.getNombre() + " " + persona.getApellido()));
        System.out.println("====================================");

    }

    public void FiltroPersonaEspecial(){
        System.out.println("Personas con cargo de director de género masculino (M)");
        personas.stream()
                .filter(persona -> persona.getCargo().equalsIgnoreCase("director"))
                .filter(persona -> persona.getGenero().equalsIgnoreCase("masculino"))
                        .peek(persona -> System.out.println(
                                "Nombre: "+persona.getNombre()+" "+persona.getApellido() + " | Sueldo por 8 horas :$ "+persona.getSueldoHora()
                        ))
                .forEach(persona -> {});
        System.out.println("====================================");
    }
    public void PersonaDesarrollador(){
        System.out.println("Primera persona desarrolladora de género femenino:");
        personas.stream()
                .filter(persona -> persona.getCargo().equalsIgnoreCase("Desarrollador"))
                .filter(persona -> persona.getGenero().equalsIgnoreCase("femenino"))
                .findFirst()
                .ifPresent(persona -> System.out.println(persona.getNombre() + " " + persona.getApellido()));
    }
    public void MayorSueldoHoraDesarrollador(){
        Optional<Persona>MasGana = personas.stream()
                .filter(persona -> persona.getCargo().equalsIgnoreCase("Desarrollador"))
                .max((persona1, persona2)->Double.compare(persona1.getSueldoHora(), persona2.getSueldoHora()));
        if(MasGana.isPresent()){
            Persona desarrollador = MasGana.get();
            System.out.println("Desarrolador que mas gana por hora:");
            System.out.println(desarrollador.getNombre() + " " + desarrollador.getApellido());
            System.out.println("Sueldo por hora: $" + desarrollador.getSueldoHora());

        }
    }


}
