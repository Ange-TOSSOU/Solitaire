import java.util.Comparator;

public class SortByCarte implements Comparator<Carte> {
    @Override
    public int compare(Carte o1, Carte o2)
    {
        if (o1.getValeur() > o2.getValeur()) {
            return 1;
        }
        if (o1.getValeur() < o2.getValeur()) {
            return -1;
        }

        return 0;
    }
}
