package com.example.kata.bridgehand;

public class Card {
    private final char description;
    public int value;

    public static Card aNew (char description) {
        return new Card(description, valueOfCard(description));
    }

    private static Integer valueOfCard (int card) {
        int result = 0;
        switch (card) {
            case (int) 'A':
                result = 4;
                break;
            case (int) 'K':
                result = 3;
                break;
            case (int) 'Q':
                result = 2;
                break;
            case (int) 'J':
                result = 1;
                break;
        }
        return result;
    }

    private Card (final char description, final Integer value) {
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
