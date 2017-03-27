package com.example.kata.bridgehand.acceptance;

import java.util.function.IntBinaryOperator;
import java.util.function.IntUnaryOperator;

public class Hand {
    public final int total;

    public Hand (final String... suitDescriptions) {
        total = allSuitsFrom(suitDescriptions).chars()
                .map(valueOfCard())
                .sum();

    }

    private String allSuitsFrom (final String[] descriptions) {
        return String.join("", descriptions);
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
