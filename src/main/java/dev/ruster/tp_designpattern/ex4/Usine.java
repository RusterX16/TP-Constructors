package dev.ruster.tp_designpattern.ex4;

public abstract class Usine {

    private String constructeur;
    private String ville;

    protected Usine(String constructeur, String ville) {
        this.constructeur = constructeur;
        this.ville = ville;
    }

    public abstract Avion fabriqueAvion(String modelAvion, Fuselage fuselage);

    public abstract Satellite fabriquerSatellite(String modelSatellite);
}
