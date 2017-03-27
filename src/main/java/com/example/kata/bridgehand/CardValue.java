package com.example.kata.bridgehand;

public class CardValue {

    public static final CardValue POINTLESS = CardValue.of(0);
    public static final CardValue _1 = CardValue.of(1);
    public static final CardValue _2 = CardValue.of(2);
    public static final CardValue _3 = CardValue.of(3);
    public static final CardValue _4 = CardValue.of(4);

    private final int value;

    public static CardValue of (final int value) {
        return new CardValue(value);
    }

    private CardValue (final int value) {
        this.value = value;
    }

    public CardValue add (final CardValue ele) {
        return CardValue.of(this.value + ele.value);
    }

    @Override
    public boolean equals (final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        final CardValue cardValue = (CardValue) o;

        return value == cardValue.value;

    }

    @Override
    public int hashCode () {
        return value;
    }
}
