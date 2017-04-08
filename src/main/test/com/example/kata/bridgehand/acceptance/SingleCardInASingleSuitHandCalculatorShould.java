package com.example.kata.bridgehand.acceptance;


import com.example.kata.bridgehand.CardValue;
import com.example.kata.bridgehand.Hand;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

@RunWith(Parameterized.class)
public class SingleCardInASingleSuitHandCalculatorShould {
    @Parameterized.Parameters
    public static Collection<Object[]> data () {
        return Arrays.asList(
                new Object[]{new String[]{"SA???",
                        "H???",
                        "D???",
                        "C???"}, 4},
                new Object[]{new String[]{"S????",
                        "HA??",
                        "D???",
                        "C???"}, 4},
                new Object[]{new String[]{"S????",
                        "H???",
                        "DA??",
                        "C???"}, 4},
                new Object[]{new String[]{"S????",
                        "H???",
                        "D???",
                        "CA??"}, 4});
    }

    private String[] handDescription;

    private CardValue expectedHandValue;

    public SingleCardInASingleSuitHandCalculatorShould (final String[] handDescription, final int expectedHandValue) {
        this.handDescription = handDescription;
        this.expectedHandValue = CardValue.of(expectedHandValue);
    }

    @Test
    public void test () {
        final Hand hand = new Hand(this.handDescription);
        assertThat(hand.total, is(this.expectedHandValue));
    }
}
