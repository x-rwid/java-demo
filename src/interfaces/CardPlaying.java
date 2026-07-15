package interfaces;

public class CardPlaying implements Card {

    private Rank rank;
    private Suit suit;

    // constructor

    // Card abstract method'larini tatbiqi
    public Suit getSuit() {
        return this.suit;
    }
    public Rank getRank() {
        return this.rank;
    }

    public int hashCode() {
        return ((suit.value()-1)*13)+ rank.value();
    }

    // Comparable<Card> method'ini tatbiqi
    public int compareTo(Card o) {
        return this.hashCode() - o.hashCode();
    }
}
