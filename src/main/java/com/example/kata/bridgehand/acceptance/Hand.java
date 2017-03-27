package com.example.kata.bridgehand.acceptance;

import com.example.kata.bridgehand.Card;
import com.example.kata.bridgehand.CardValue;

import java.util.stream.Stream;

public class Hand {
    public final CardValue total;
    public final CardValue spades;

    public Hand (final String... suitDescriptions) {
        total = allCardsIn(hand(suitDescriptions))
                .map(c->c.value)
                .reduce(CardValue.POINTLESS,(acc, ele) -> acc.add(ele));
        spades = allCardsIn(spades(suitDescriptions))
                .map(c->c.value)
                .reduce(CardValue.POINTLESS,(acc, ele) -> acc.add(ele));
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
