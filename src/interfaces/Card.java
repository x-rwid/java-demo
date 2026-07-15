package interfaces;

public interface Card extends Comparable<Card> {

    public enum Suit {
        DIAMONDS (1, "G'iwtinlar"),
        CLUBS    (2, "Qorg'alar" ),
        HEARTS   (3, "Yuraklar"  ),
        SPADES   (4, "Cillaklar" );

        private final int value;
        private final String text;
        Suit(int value, String text) {
            this.value = value;
            this.text = text;
        }
        public int value() { return value; }
        public String text() { return text; }
    }

    public enum Rank {
        DEUCE (2 , "Ikki"    ),
        THREE (3 , "Uc"      ),
        FOUR  (4 , "To'rt"   ),
        FIVE  (5 , "Bew"     ),
        SIX   (6 , "Olti"    ),
        SEVEN (7 , "Yetti"   ),
        EIGHT (8 , "Sakkiz"  ),
        NINE  (9 , "To'qqiz" ),
        TEN   (10, "O'n"     ),
        JACK  (11, "Baron"   ),
        QUEEN (12, "Qirolica"),
        KING  (13, "Qirol"   ),
        ACE   (14, "Tuz"     );
        private final int value;
        private final String text;
        Rank(int value, String text) {
            this.value = value;
            this.text = text;
        }
        public int value() { return value; }
        public String text() { return text; }
    }

    public Card.Suit getSuit();
    public Card.Rank getRank();
}
