package dev.ruster.tp_designpattern.ex3;

public class MasterCardCreator implements CardCreator {

    @Override
    public Card create() {
        return new MasterCard();
    }
}
