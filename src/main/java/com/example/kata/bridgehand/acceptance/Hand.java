package com.example.kata.bridgehand.acceptance;

import java.util.stream.Stream;

public class Hand {
    public final int total;

    public Hand (final String... descriptions) {
        total = Stream.of(descriptions)
                .map(description -> description
                        .chars()
                        .map((char_) -> {
                            int result = 0;
                            switch (char_){
                                case (int) 'A':
                                    result = 4;
                                    break;
                                case (int) 'K':
                                    result = 3;
                                break;
                            }
                            return result;
                        })
                .reduce(0, (a, b) -> a + b))
                .reduce(0, (a, b) -> a + b).intValue();
    }

}
