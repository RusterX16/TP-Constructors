package dev.ruster.tp_designpattern.ex2;

public class Printer {
    
    private static Printer instance = null;

    private Printer() {
        // Pour détruire le constructor public par défaut de Java
    }

    public static Printer getInstance() {
        if(instance != null) {
            return instance;        
        }
        Printer printer = new Printer();
        instance = printer;
        return printer;
    }
}
