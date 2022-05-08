package dev.ruster.tp_designpattern.ex4;

public class Avion {
    
    private String marque;
    private String model;
    private Fuselage fuselage;

    public Avion(String marque, String model, Fuselage fuselage) {
        this.marque = marque;
        this.model = model;
        this.fuselage = fuselage;
    }

    @Override
    public String toString() {
        return "[" + 
            "   marque = " + marque + "\n" +
            "   model = " + model + "\n" + 
            "   fuselage = " + fuselage + "\n" +
        "]";
    }
}
