package dev.ruster.tp_designpattern.ex3;

public class CardFactory {

    public Card createCard(String cardType) {
        return switch(cardType.toLowerCase()) {
            case "visa" -> new Visa();
            case "mastercard" -> new MasterCard();
            default -> throw new IllegalArgumentException("Invalid Card Type");
        };
    }
}