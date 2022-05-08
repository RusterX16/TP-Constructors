package dev.ruster.tp_designpattern.ex4;

public class UsineAirbus extends Usine {

    public UsineAirbus(String constructeur, String ville) {
        super(constructeur, ville);
    }

    @Override
    public Avion fabriqueAvion(String modelAvion, Fuselage fuselage) {
        return new Airbus(modelAvion, fuselage);
    }

    @Override
    public Satellite fabriquerSatellite(String modelSatellite) {
        return new SatelliteTerrestre(modelSatellite);
    }
}
