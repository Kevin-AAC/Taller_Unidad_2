package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Principal {
    private Map<String, List<Animal>> clasificacion;
    private List<Animal> animales;
    public Principal() {
        clasificacion = new HashMap<>();
        animales = new ArrayList<>();
    }
    public void AgregarAnimal() {
        Animal leon = new Animal("Leon","Macho","Terrestre");
        Animal Pez = new Animal("Pez_Globo","Macho","Acuatico");

        animales.add(leon);
        animales.add(Pez);

        for(Animal a : animales) {
            String categoria = a.getTipo();
            clasificacion.computeIfAbsent(categoria, k -> new ArrayList<>()).add(a);
        }

    }
    public void Mostar(){
        for (Map.Entry<String, List<Animal>> entry : clasificacion.entrySet()) {
            System.out.println("Categoría: " + entry.getKey());
            for (Animal a : entry.getValue()) {
                System.out.println("  - " + a);
            }
        }

    }



}
