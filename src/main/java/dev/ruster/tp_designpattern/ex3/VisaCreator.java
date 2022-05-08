package dev.ruster.tp_designpattern.ex3;

public class VisaCreator implements CardCreator {

    @Override
    public Card create() {
        return new Visa();
    }
}