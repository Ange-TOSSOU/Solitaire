public class Test {
    public static void main(String [] args){
        Carte c1 = new Carte(10,2);
        Carte c2 = new Carte(Carte.ROI,Carte.TREFLES);
        Carte c3 = new Carte(Carte.DAME, Carte.CARREAUX);
        Carte c4 = new Carte(8, Carte.PIQUES);
        Carte c5 = new Carte(Carte.AS, Carte.PIQUES);
        Carte c6 = new Carte(7, Carte.TREFLES);
        MainJoueur m = new MainJoueur();
        m.ajouterCarte(c1);
        m.ajouterCarte(c2);
        m.ajouterCarte(c3);
        m.ajouterCarte(c4);
        m.ajouterCarte(c5);
        m.ajouterCarte(c6);
        System.out.println(m);
        m.trieParValeur();
        System.out.println(m);
        m.enleverCarte(2); // on enlève le 8 de Piques
        System.out.println(m);
    }
}
