public class TestDeck {
    public static void main(String [] args){
        Deck deck = new Deck();
        System.out.println(deck);

        deck.shuffle();
        System.out.println(deck);

        System.out.println(deck.distribuerCarte());
        System.out.println(deck.distribuerCarte());
    }
}
