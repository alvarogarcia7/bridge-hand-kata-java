package com.example.kata.bridgehand.acceptance;

import java.util.stream.IntStream;

public class Hand {
    public final int total;
    public final int spades;

    public Hand (final String... suitDescriptions) {
        total = allCardsIn(hand(suitDescriptions))
                .map(this::valueOfCard)
                .sum();
        spades = allCardsIn(spades(suitDescriptions))
                .map(this::valueOfCard)
                .sum();
    }

    private IntStream allCardsIn(String cardDescriptions) {
        return cardDescriptions.chars();
    }

    private String hand (final String[] suitDescriptions) {
        return String.join("", suitDescriptions);
    }

    private String spades (final String[] suitDescriptions) {
        return suitDescriptions[0];
    }

    private Integer valueOfCard (int card) {
        int result = 0;
        switch (card) {
            case (int) 'A':
                result = 4;
                break;
            case (int) 'K':
                result = 3;
                break;
            case (int) 'Q':
                result = 2;
                break;
            case (int) 'J':
                result = 1;
                break;
        }
        return result;
    }
}
