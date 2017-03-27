package com.example.kata.bridgehand.acceptance;

import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;

public class Hand {
    public final int total;

    public Hand (final String... suitDescriptions) {
        total = allCardsInHand(suitDescriptions)
                .map(valueOfCard())
                .sum();
    }

    private IntStream allCardsInHand (final String[] suitDescriptions) {
        return String.join("", suitDescriptions).chars();
    }

    private IntUnaryOperator valueOfCard () {
        return (char_) -> {
            int result = 0;
            switch (char_) {
                case (int) 'A':
                    result = 4;
                    break;
                case (int) 'K':
                    result = 3;
                    break;
            }
            return result;
        };
    }

}
