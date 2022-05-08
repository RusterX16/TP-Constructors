package dev.ruster.tp_designpattern;

import java.util.List;

import dev.ruster.tp_designpattern.ex1.*;
import dev.ruster.tp_designpattern.ex2.*;
import dev.ruster.tp_designpattern.ex3.*;
import dev.ruster.tp_designpattern.ex4.*;


public final class Main {

    public static void main(String[] args) {

        // Exercice 1 :
        System.out.println(Singleton.generateUUID());
        System.out.println(Singleton.generateUUID());
        System.out.println(Singleton.generateUUID());


        // Exercice 2 :
        Printer p1 = Printer.getInstance();
        Printer p2 = Printer.getInstance();

        System.out.println(p1);
        System.out.println(p2);
        // p1 == p2


        // Exercice 3 :
        CardFactory factory = new CardFactory();
        Card card = factory.createCard("Visa");
        card.credit();
        // Crédit de Visa

        Card visa = new VisaCreator().create();
        visa.debit();
        // Débit de Visa

        Card masterCard = new MasterCardCreator().create();
        masterCard.credit();
        // Crédit de MasterCard


        // Exercice 4 :
        UsineAirbus usineAirbus = new UsineAirbus("Airbus", "Montpellier");
        UsineBoeing usineBoeing = new UsineBoeing("Boeing", "Montpellier");

        Avion a1 = usineAirbus.fabriqueAvion("320", new Fuselage(
            List.of(
                new Reacteur("Rolls-Royce", 5, 10),
                new Reacteur("Rolls-Royce", 5, 10)
            ), 30, 120));

        Avion a2 = usineAirbus.fabriqueAvion("320", new Fuselage(
            List.of(
                new Reacteur("Trent", 6, 9),
                new Reacteur("Trent", 6, 9)
            ), 30, 120));

        Avion a3 = usineAirbus.fabriqueAvion("380", new Fuselage(
            new Reacteur("Rolls-Royce", 8, 12),
            4, 110, 550));

        Avion a4 = usineAirbus.fabriqueAvion("380", new Fuselage(
            new Reacteur("Trent", 9, 13),
            4, 110, 550));

        Avion a5 = usineBoeing.fabriqueAvion("737", new Fuselage(
            List.of(
                new Reacteur("Rolls-Royce", 4, 8),
                new Reacteur("Rools-Royce", 4, 8)
            ), 28, 110));

        Avion a6 = usineBoeing.fabriqueAvion("737", new Fuselage(
            List.of(
                new Reacteur("Trent", 4, 8),
                new Reacteur("Trent", 7, 9)
            ), 28, 110));

        Avion a7 = usineBoeing.fabriqueAvion("747", new Fuselage(
            new Reacteur("Rolls-Royce", 20, 38), 
            4, 100, 375));

        Avion a8 = usineBoeing.fabriqueAvion("747", new Fuselage(
            new Reacteur("Trent", 22, 41), 
            4, 100, 375));

        Satellite jason1 = usineAirbus.fabriquerSatellite("Jason1");
        Satellite argos = usineBoeing.fabriquerSatellite("Argos");

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);
        System.out.println(a5);
        System.out.println(a6);
        System.out.println(a7);
        System.out.println(a8);
        System.out.println(jason1);
        System.out.println(argos);
    }
}