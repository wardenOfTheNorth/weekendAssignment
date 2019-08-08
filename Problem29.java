import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Card implements Comparable<Card> {
    int number;
    char symbol;

    public Card(int number, char symbol) {
        this.number = number;
        this.symbol = symbol;
    }

    @Override
    public boolean equals(Object obj) {
        Card cur = (Card) obj;
        return cur.symbol == symbol;
    }

    @Override
    public int hashCode() {
        return (int) symbol;
    }

    @Override
    public int compareTo(Card o) {
        return symbol - o.symbol;
    }

    @Override
    public String toString() {
        return symbol + " " + number;
    }
}

public class TwentyNinth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of cards: ");
        int n = sc.nextInt();
        Set<Card> cards = new HashSet<>();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter card");
            cards.add(new Card(sc.nextInt(), sc.next().charAt(0)));
        }
        System.out.println(cards);
    }
}
