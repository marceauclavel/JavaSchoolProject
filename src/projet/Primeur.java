package projet;

import java.awt.*;

public class Primeur extends Article implements IvendreKilo{

    public Primeur(String _nom, float _prix) {
        super(_nom, _prix, "Mangez 5 fruits et légumes par jour!");
    }

    public Primeur(String _nom, float _prix, String _slogan) {
        super(_nom, _prix ,_slogan);
    }

    @Override
    public void afficheSlogan() {
        System.out.println(slogan);
    }

    @Override
    public void vendre(float quantite, CompteBanq compteVendeur, CompteBanq compteAcheteur) {

    }

    @Override
    public void rembourser(float quantite, CompteBanq compteVendeur, CompteBanq compteAcheteur) {

    }
}
