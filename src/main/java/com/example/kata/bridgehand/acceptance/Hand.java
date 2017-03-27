package com.example.kata.bridgehand.acceptance;

import java.util.function.IntUnaryOperator;

public class Hand {
    public final int total;

    public Hand (final String... descriptions) {
        total = allSuitsFrom(descriptions).chars()
                        .map(valueOfCard())
                        .reduce(0, (a, b) -> a + b);

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
