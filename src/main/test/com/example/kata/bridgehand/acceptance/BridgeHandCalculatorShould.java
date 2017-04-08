package com.example.kata.bridgehand.acceptance;

import com.example.kata.bridgehand.CardValue;
import com.example.kata.bridgehand.Hand;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;


public class BridgeHandCalculatorShould {

    private static final Hand MAXIMUM_POINTS_HAND = new Hand("SAKQ",
            "HAKQ",
            "DAKQ",
            "CAKQJ");

    @Test
    public void tell_no_points_on_a_hand_made_of_pointless_cards () {

        final Hand hand = new Hand("S????",
                "H???",
                "D???",
                "C???");
        assertThat(hand.total, is(CardValue.POINTLESS));
    }

    @Test
    public void points_for_spades_suit () {
        assertThat(MAXIMUM_POINTS_HAND.spades, is(CardValue.of(9)));
    }
}
