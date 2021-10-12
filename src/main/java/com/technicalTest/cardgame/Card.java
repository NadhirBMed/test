package com.technicalTest.cardgame;

import lombok.Getter;

@Getter
public class Card {
    private Integer value;
    private Integer type;

    // set type in the range of types: 1 Diamonds ♦, 2 Hearts ❤, 3 Clubs ♣, 4 Spades ♠
    public void setType(Integer type) {
        if (type < 1 || type > 4) {
            throw new IllegalArgumentException();
        }
        this.type = type;
    }

    // set value in the range of values: 1..13
    public void setValue(Integer value) {
        if (value < 1 || value > 13) {
            throw new IllegalArgumentException();
        }
        this.value = value;
    }

    // initialise Card with a valid value and type
    public Card(Integer value, Integer type) {
        if (type < 1 || type > 4 || value < 1 || value > 13) {
            throw new IllegalArgumentException();
        }
        this.value = value;
        this.type = type;
    }

    // get Card as String
    public String getName() {
        return valueName(value) + typeName(type);
    }

    public static char typeName(Integer type) {
        switch (type) {
            case 1:
                return  '\u2666';
            case 2:
                return '\u2764';
            case 3:
                return '\u2663';
            default:
                return '\u2660';
        }
    }

    public static String valueName(Integer value) {
        switch (value) {
            case 1:
                return "A";
            case 11:
                return "J";
            case 12:
                return "Q";
            case 13:
                return "K";
            default:
                return Integer.toString(value);
        }
    }
}
