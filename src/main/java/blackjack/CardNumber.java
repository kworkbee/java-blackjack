package blackjack;

import java.util.Arrays;

public enum CardNumber {

    ACE("A", 1),
    TWO("2", 2),
    THREE("3", 3),
    FOUR("4", 4),
    FIVE("5", 5),
    SIX("6", 6),
    SEVEN("7", 7),
    EIGHT("8", 8),
    NINE("9", 9),
    JACK("J", 10),
    QUEEN("Q", 10),
    KING("K", 10);

    private final String initial;
    private final int score;

    CardNumber(String initial, int score) {
        this.initial = initial;
        this.score = score;
    }

    public static CardNumber of(final String initial) {
        return Arrays.stream(values())
            .filter(cardNumber -> cardNumber.initial == initial)
            .findFirst()
            .orElseThrow(IllegalArgumentException::new);
    }

    public boolean isAce() {
        return this == ACE;
    }

    public int getScore() {
        return this.score;
    }

    public String getInitial() {
        return this.initial;
    }

}
