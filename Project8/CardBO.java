package Project8;

import java.util.*;

public class CardBO {

    public Map<String, List<Card>> getCards(List<Card> cardList) {

        Map<String, List<Card>> map = new TreeMap<>();

        for (Card card : cardList) {

            if (!map.containsKey(card.getSymbol())) {
                map.put(card.getSymbol(), new ArrayList<Card>());
            }

            map.get(card.getSymbol()).add(card);
        }

        return map;
    }
}