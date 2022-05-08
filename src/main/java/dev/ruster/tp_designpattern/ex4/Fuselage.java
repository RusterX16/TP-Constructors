package dev.ruster.tp_designpattern.ex4;

import java.util.ArrayList;
import java.util.List;

import java.util.stream.IntStream;

public class Fuselage {

    private List<Reacteur> reacteurs = new ArrayList<>();
    private int poids;
    private int capacite;

    public Fuselage(List<Reacteur> reacteurs, int poids, int capacite) {
        if(reacteurs.size() < 2) {
            throw new IllegalArgumentException("Fuselage must have at least 2 reactors");
        }
        this.reacteurs.addAll(reacteurs);
        this.poids = poids;
        this.capacite = capacite;
    }

    public Fuselage(Reacteur reacteur, int count, int poids, int capacite) {
        if(count < 2) {
            throw new IllegalArgumentException("Fuselage must have at least 2 reactors");
        }
        IntStream.range(0, count + 1).forEach(i -> reacteurs.add(reacteur));
        this.poids = poids;
        this.capacite = capacite;
    }

    @Override
    public String toString() {
        return "[" + 
            "   reacteurs = " + reacteurs + "\n" +  
            "   poids = " + poids + "\n" + 
            "   capacite = " + capacite + "\n" + 
        "]";
    }
}
