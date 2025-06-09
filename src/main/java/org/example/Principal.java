package org.example;

import java.util.*;

public class Principal {
    private Map<String, List<Animal>> clasificacion;
    private List<Animal> animales;
    public Principal() {
        clasificacion = new HashMap<>();
        animales = new ArrayList<>();
    }
    public void AgregarAnimalConsola(){
        Scanner sc = new Scanner(System.in);
        System.out.println("============================================================");
        System.out.println("Registro de Animales");
        System.out.println("Escriba salir en nombre de animal para terminar los registros ");
        System.out.println("************************************************************");

        while (true){
            System.out.println("Ingrese el Nombre del Animal: ");
            String nombre = sc.nextLine();
            if (nombre.equalsIgnoreCase("salir")) break;

            System.out.println("Ingrese el Tipo de animal (terrestre, aéreo, acuático): ");
            String tipo = sc.nextLine();
            if (!tipo.equalsIgnoreCase("Terrestre")&&
                !tipo.equalsIgnoreCase("Acuatico")&&
                !tipo.equalsIgnoreCase("Aereo")){
                System.out.println("Tipo de animal **" + tipo + "** no es valido");
                continue;
            };

            System.out.println("Ingrese el Genero (masculino, femenino): ");
            String genero = sc.nextLine();


            Animal animal = new Animal(nombre, tipo, genero);
            animales.add(animal);

            clasificacion.computeIfAbsent(tipo, k -> new ArrayList<>()).add(animal);
            System.out.println("🟢Animal registrado correctamente.🟢\n");
        }

    }
//    public void AgregarAnimal() {
//        Animal leon = new Animal("Leon","Macho","Terrestre");
//        Animal Pez = new Animal("Pez_Globo","Macho","Acuatico");
//
//        animales.add(leon);
//        animales.add(Pez);
//    }
    public void Mostar(){
        System.out.println("\n---------------------------------------------");
        System.out.println("     🐾 CLASIFICACIÓN DE ANIMALES 🐾");
        System.out.println("---------------------------------------------\n");

        for (Map.Entry<String, List<Animal>> entry : clasificacion.entrySet()) {
            System.out.println(entry.getKey());
            for (Animal a : entry.getValue()) {
                System.out.println("  - " + a);
            }
        }

    }



}
