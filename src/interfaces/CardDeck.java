package interfaces;

import java.util.Comparator;
import java.util.List;
import java.util.Map;

public interface CardDeck {

    List<Card> getCards();
    CardDeck deckFactory();
    int size();
    void addCard(Card card);
    void addCards(List<Card> cards);
    void addDeck(CardDeck deck);
    void shuffle();
    void sort();
    void sort(Comparator<Card> c);
    String deckToString();

    Map<Integer,CardDeck> deal(int players, int numberOfCards) throws IllegalArgumentException;
}
