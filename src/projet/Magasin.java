package projet;

import java.awt.*;
import java.util.ArrayList;

public class Magasin {

    public CompteBanq caisse;
    private Personne boss;
    private String adresse;
    private int nbVendeurs;
    private ArrayList<Article> articles;
    private ArrayList<Integer> stock;

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////

    public Magasin(String _adresse, Personne _boss, int _nbVendeurs) {
        adresse = _adresse;
        boss = _boss;
        nbVendeurs = _nbVendeurs;
        articles = new ArrayList<Article>();
        stock = new ArrayList<Integer>();
        caisse = new CompteBanq("", boss, "0000", "0000");
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getNbVendeurs() {
        return nbVendeurs;
    }

    public void setNbVendeurs(int nbVendeurs) {
        this.nbVendeurs = nbVendeurs;
    }

    public CompteBanq getCaisse() {
        return caisse;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void achetteArticle(Article article, int quantite) throws BanqCodeException, BanqSoldeInsuffisant {
        if (caisse.retrait(article.getPrix() * quantite)){
            articles.add(article);
            stock.add(quantite);
        }
    }

    public void vendArticle(Article article, int quantite, CompteBanq compteClient) {
        boolean enStock = articles.contains(article);
        enStock = enStock && (stock.get(articles.indexOf(article)) >= quantite);
        if (enStock) {
            try {
                article.vendre(quantite, caisse, compteClient);
                stock.set(articles.indexOf(article), stock.get(articles.indexOf(article)) - quantite);
            } catch (BanqSoldeInsuffisant e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println("Internal problem");
            }
        } else {
            System.out.println("\nIl n'y a pas " + quantite + " " + article.nom + " en stock.");
        }

    }

    public void afficheArticles() {
        System.out.println("\n");
        for (int i = 0; i < articles.size(); i++) {
            System.out.println(articles.get(i).nom + " : " + stock.get(i));
        }
    }

    public void afficheSoldes() {
        System.out.println("\n");
        for (int i = 0; i < articles.size(); i++) {
            System.out.println(articles.get(i).nom + " : " + articles.get(i).slogan);
        }
    }

}
