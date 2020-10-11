package projet;

public class Scenario {

    public Scenario() {
        try {
            scenario1();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    void scenario1() throws BanqCodeException, BanqSoldeInsuffisant {

        Personne boss = new Personne("Michel", "Dumas");
        Magasin magasin = new Magasin("12 rue du moulin", boss, 3);
        magasin.caisse.versement(10000);

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////

        Primeur tomate = new Primeur("tomates", 2);
        magasin.achetteArticle(tomate, 40 );
        //Primeur chou = new Primeur("choux", 4);
        //magasin.achetteArticle(chou, 30 );
        Habit jean = new Habit("jeans", 40, "Levis un jours, Lewis toujours!");
        magasin.achetteArticle(jean, 10 );
        Electromenager frigo = new Electromenager("frigo", 200, "Le frigo, c'est rigolo!");
        magasin.achetteArticle(frigo, 12 );
        magasin.afficheArticles();

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////

        EleveDigital moi = new EleveDigital("Marceau", "Clavel", 12345678, 2020, 4);
        CompteBanq monCompte = new CompteBanq("1542777123", moi, "1111", "1111");
        monCompte.versement(300);
        magasin.vendArticle(tomate, 20, monCompte);
        magasin.vendArticle(frigo, 1, monCompte);
        magasin.vendArticle(jean, 1, monCompte);
        magasin.afficheArticles();

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////

        System.out.println("\nC'est Noel !!!\nC'est les soldes !!!");
        magasin.afficheSoldes();
        monCompte.setDecouvertAutorise(100);
        magasin.vendArticle(jean, 1, monCompte);

    }

}
