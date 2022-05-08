package dev.ruster.tp_designpattern.ex3;

public class Visa implements Card {

    @Override
    public void credit() {
        System.out.println("Crédit de " + getClass());
    }

    @Override
    public void debit() {
        System.out.println("Débit de " + getClass());
    }
}
