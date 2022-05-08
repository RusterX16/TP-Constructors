package dev.ruster.tp_designpattern.ex4;

public class Satellite {

    private String model;

    public Satellite(String modelSatellite) {
        model = modelSatellite;
    }

    @Override
    public String toString() {
        return "[" +
            "   model = " + model + "\n" +
        "]";
    }
}
