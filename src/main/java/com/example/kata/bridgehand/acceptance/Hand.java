package com.example.kata.bridgehand.acceptance;

public class Hand {
    public final int total;

    public Hand (final String... descriptions) {
        total = (int) (descriptions[0].chars().filter(char_ -> ((int)'A') == (char_)).count() * 4) + (int)
                (descriptions[1].chars().filter(char_ -> ((int)'A') == (char_)).count() * 4)+(int)(descriptions[2]
                .chars().filter(char_ -> ((int)'A') == (char_)).count() * 4);
    }
}
