package com.example.kata.bridgehand.acceptance;

import java.util.stream.Stream;

public class Hand {
    public final int total;

    public Hand (final String... descriptions) {
        total = Stream.of(descriptions)
                .map(description -> description
                        .chars()
                        .filter(char_ -> ((int) 'A') == (char_))
                        .count() * 4)
                .reduce(0L, (a, b) -> a + b).intValue()+Stream.of(descriptions)
                .map(description -> description
                        .chars()
                        .filter(char_ -> ((int) 'K') == (char_))
                        .count() * 3)
                .reduce(0L, (a, b) -> a + b).intValue();
    }
}
