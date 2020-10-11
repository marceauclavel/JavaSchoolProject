package projet;

public class Electromenager extends Article implements IvendrePiece{

    public Electromenager(String _nom, float _prix, String _slogan) {
        super(_nom, _prix, _slogan);
    }

    @Override
    public void afficheSlogan() {

    }

    @Override
    public void vendre(float quantite, CompteBanq compteVendeur, CompteBanq compteAcheteur) throws BanqSoldeInsuffisant {
        float montant = quantite * prix;
        try {
            compteAcheteur.retrait(montant);
            compteVendeur.versement(montant);
        } catch (BanqCodeException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void rembourser(int quantite, CompteBanq compteVendeur, CompteBanq compteAcheteur) {

    }
}
