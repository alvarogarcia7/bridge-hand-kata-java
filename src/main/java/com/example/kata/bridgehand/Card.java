package com.example.kata.bridgehand;

public class Card {
    private final char description;
    public final CardValue value;

    public static Card aNew (char description) {

        Card result = new Card(description, CardValue.POINTLESS);
        switch (description) {
            case (int) 'A':
                result = new Card(description, CardValue._4);
                break;
            case (int) 'K':
                result = new Card(description, CardValue._3);
                break;
            case (int) 'Q':
                result = new Card(description, CardValue._2);
                break;
            case (int) 'J':
                result = new Card(description, CardValue._1);
                break;
        }
        return result;
    }

    private Card (final char description, final CardValue value) {
        this.description = description;
        this.value = value;
    }

    @Override
    public boolean equals (final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        final Card card = (Card) o;

        return description == card.description;

    }

    @Override
    public int hashCode () {
        return (int) description;
    }

    @Override
    public String toString () {
        final StringBuffer sb = new StringBuffer("Card{");
        sb.append("description=").append(description);
        sb.append('}');
        return sb.toString();
    }


}
