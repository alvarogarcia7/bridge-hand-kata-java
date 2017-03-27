package com.example.kata.bridgehand.acceptance;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

@RunWith(Parameterized.class)
public class SingleCardInAMultipleSuitsHandCalculatorShould {
    @Parameterized.Parameters
    public static Collection<Object[]> data () {
        return Arrays.asList(new Object[][]{
                new Object[]{"Only Aces", new String[]{"SA???",
                        "HA??",
                        "D???",
                        "C???"}, 8}
        });
    }

    private String[] handDescription;

    private int expectedHandValue;

    public SingleCardInAMultipleSuitsHandCalculatorShould (final String description, final String[] handDescription,
                                                           final int expectedHandValue) {
        this.handDescription = handDescription;
        this.expectedHandValue = expectedHandValue;
    }

    @Test
    public void test () {
        final Hand hand = new Hand(this.handDescription);
        assertThat(hand.total, is(this.expectedHandValue));
    }
}
