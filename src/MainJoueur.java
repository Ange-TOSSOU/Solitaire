import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MainJoueur {
    private List<Carte> mainJ;

    public MainJoueur() {
        mainJ = new ArrayList<Carte>();
    }

    public void clear() {
        mainJ.clear();
    }

    public void ajouterCarte(Carte c) {
        if (mainJ.size() < 6) {
            mainJ.add(c);
        }
    }

    public void enleverCarte(int position) {
        if (0 <= position && position < mainJ.size()) {
            mainJ.remove(position);
        }
    }

    public Carte getCarte(int position) {
        return mainJ.get(position);
    }

    /*public void trieParValeur() {
        mainJ.sort(new Comparator<Carte>() {
            @Override
            public int compare(Carte o1, Carte o2) {
                if (o1.getValeur() > o2.getValeur()) {
                    return 1;
                }
                if (o1.getValeur() < o2.getValeur()) {
                    return -1;
                }

                return 0;
            }
        });
    }*/

    public void trieParValeur() {
        mainJ.sort(new TriParCarte());
    }

    @Override
    public String toString() {
        if (this.mainJ.size() == 0) {
            return "Aucune carte dans la main du joueur.\n";
        }

        String res = "La main du joueur contient ";
        if(this.mainJ.size() == 1) {
            res += "1 carte.\n";
        } else {
            res += this.mainJ.size() + " cartes.\n";
        }
        for (Carte c : mainJ) {
            res += "  " + c.toString() + "\n";
        }

        return res;
    }
}
