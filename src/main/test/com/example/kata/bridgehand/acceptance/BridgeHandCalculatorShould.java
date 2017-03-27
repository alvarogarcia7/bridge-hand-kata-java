package com.example.kata.bridgehand.acceptance;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class BridgeHandCalculatorShould {

    @Test
    public void tell_no_points_on_a_hand_made_of_pointless_cards () {

        final Hand hand = new Hand("S????",
                "H???",
                "D???",
                "C???");
        assertThat(hand.total, is(0));
    }

    @Test
    public void tell_the_points_on_a_hand_made_of_a_single_card_belonging_to_a_single_suit () {

        final Hand hand = new Hand("SA???",
                "H???",
                "D???",
                "C???");
        assertThat(hand.total, is(4));
    }
}
