public class Carte {
    public final static int
        PIQUES = 0,
        COEURS = 1,
        CARREAUX = 2,
        TREFLES = 3;

    public final static int
            AS = 1,
            VALET = 11,
            DAME = 12,
            ROI = 13;

    private final static String[] nomValeur = {"As", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valet", "Dame", "Roi"};
    private final static String[] nomCouleur = {"Piques", "Coeurs", "Carreaux", "Trefles"};

    private int valeur;
    private int couleur;
    private boolean visible;

    public Carte(int valeur, int couleur) {
        String possibleException = "";
        if (valeur < AS || valeur > ROI) {
            possibleException += "Illegal Valeur : " + valeur + "\n";
        }
        if (couleur < PIQUES || couleur > TREFLES) {
            possibleException += "Illegal Couleur : " + couleur + "\n";
        }
        if (!possibleException.isEmpty()) {
            throw new IllegalArgumentException(possibleException);
        }

        this.valeur = valeur;
        this.couleur = couleur;
        this.visible = false;
    }

    public int getValeur() {
        return valeur;
    }
    public int getCouleur() {
        return couleur;
    }

    public String getValeurCommeChaine() {
        if (AS <= this.getValeur() && this.getValeur() <= ROI) {
            return nomValeur[this.getValeur() - 1];
        }

        return "Undefined";
    }
    public String getCouleurCommeChaine() {
        if (PIQUES <= this.getCouleur() && this.getCouleur() <= TREFLES) {
            return nomCouleur[this.getCouleur()];
        }

        return "Undefined";
    }

    public boolean getVisible() {
        return this.visible;
    }
    public void retourne() {
        this.visible = true;
    }

    @Override
    public String toString() {
        return getValeurCommeChaine() + " de " + getCouleurCommeChaine();
    }
}
