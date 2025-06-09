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


}
