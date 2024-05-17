import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Deck {
    public static int NOMBREDECARTES = 52;
    private List<Carte> deck;

    public Deck() {
        this.deck = new ArrayList<>();
        for (int couleur = Carte.PIQUES; couleur <= Carte.TREFLES; couleur++) {
            for (int valeur = Carte.AS; valeur <= Carte.ROI; valeur++) {
                deck.add(new Carte(valeur, couleur));
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(deck);
    }

    public Carte distribuerCarte() {
        if (this.deck.size() == 0) {
            return null;
        }
        return this.deck.remove(this.deck.size() - 1);
    }

    public int cartesRestantes() {
        return this.deck.size();
    }

    @Override
    public String toString() {
        if (this.deck.size() == 0) {
            return "Aucune carte dans le deck.\n";
        }

        String res = "";
        if(this.deck.size() == 1) {
            res += "1 carte";
        } else {
            res += this.deck.size() + " cartes";
        }

        res += " dans le deck\n";
        for (Carte carte : this.deck) {
            res += "  " + carte.toString() + "\n";
        }

        return res;
    }
}
