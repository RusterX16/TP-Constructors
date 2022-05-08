package dev.ruster.tp_designpattern.ex4;

public class Reacteur {

    private String marque;
    private int poids;
    private int poussee;

    public Reacteur(String marque, int poids, int poussee) {
        this.marque = marque;
        this.poids = poids;
        this.poussee = poussee;
    }

    @Override
    public String toString() {
        return "[" + 
            "   marque = " + marque + "\n" + 
            "   poids = " + poids + "\n" + 
            "   poussee = " + poussee + "\n" + 
        "]";
    }
}
