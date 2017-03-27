package com.example.kata.bridgehand.acceptance;

public class Hand {
    public final int total;

    public Hand (final String... descriptions) {
        total = String.join("", descriptions).chars()
                        .map((char_) -> {
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
                        })
                        .reduce(0, (a, b) -> a + b);

    }

}
