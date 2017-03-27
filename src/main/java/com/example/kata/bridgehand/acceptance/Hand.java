package com.example.kata.bridgehand.acceptance;

import java.util.stream.IntStream;

public class Hand {
    public final int total;

    public Hand (final String... suitDescriptions) {
        total = allCardsInHand(suitDescriptions)
                .map(this::valueOfCard)
                .sum();
    }

    private IntStream allCardsInHand (final String[] suitDescriptions) {
        return String.join("", suitDescriptions).chars();
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
        }
        return result;
    }
}
