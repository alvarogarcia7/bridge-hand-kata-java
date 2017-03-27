package com.example.kata.bridgehand.acceptance;

import com.example.kata.bridgehand.Card;

import java.util.stream.Stream;

public class Hand {
    public final int total;
    public final int spades;

    public Hand (final String... suitDescriptions) {
        total = allCardsIn(hand(suitDescriptions))
                .mapToInt(card -> card.value)
                .sum();
        spades = allCardsIn(spades(suitDescriptions))
                .mapToInt(card -> card.value)
                .sum();
    }

    private Stream<Card> allCardsIn (String cardDescriptions) {
        return cardDescriptions
                .chars()
                .mapToObj(this::asChar)
                .map(Card::aNew);
    }

    private char asChar (final int int_) {
        return (char) int_;
    }

    private String hand (final String[] suitDescriptions) {
        return String.join("", suitDescriptions);
    }

    private String spades (final String[] suitDescriptions) {
        return suitDescriptions[0];
    }
}
