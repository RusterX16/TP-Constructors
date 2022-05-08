package dev.ruster.tp_designpattern.ex4;

public class UsineBoeing extends Usine {

    public UsineBoeing(String constructeur, String ville) {
        super(constructeur, ville);
    }

    @Override
    public Avion fabriqueAvion(String modelAvion, Fuselage fuselage) {
        return new Boeing(modelAvion, fuselage);
    }

    @Override
    public Satellite fabriquerSatellite(String modelSatellite) {
        return new SatelliteEspace(modelSatellite);
    }
}
