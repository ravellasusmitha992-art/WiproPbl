package Project8;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number of Cards");
        int n = sc.nextInt();

        List<Card> list = new ArrayList<Card>();

        for (int i = 1; i <= n; i++) {

            System.out.println("Enter card " + i);

            String symbol = sc.next();
            int number = sc.nextInt();

            list.add(new Card(symbol, number));
        }

        CardBO bo = new CardBO();

        Map<String, List<Card>> map = bo.getCards(list);

        System.out.println("Distinct Symbols are :");

        for (String s : map.keySet()) {
            System.out.print(s + " ");
        }

        System.out.println();

        for (String s : map.keySet()) {

            System.out.println("Cards in " + s + " Symbol");

            int sum = 0;

            List<Card> cards = map.get(s);

            for (Card c : cards) {

                System.out.println(c.getSymbol() + " " + c.getNumber());
                sum += c.getNumber();
            }

            System.out.println("Number of cards : " + cards.size());
            System.out.println("Sum of Numbers : " + sum);
        }

        sc.close();
    }
}