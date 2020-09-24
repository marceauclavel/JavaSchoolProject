package projet;

public class Electromenager extends Article implements IvendrePiece{

    public Electromenager(String _nom, float _prix, String _slogan) {
        super(_nom, _prix, _slogan);
    }

    @Override
    public void afficheSlogan() {

    }

    @Override
    public void vendre(int quantite, CompteBanq compteVendeur, CompteBanq compteAcheteur) {

    }

    @Override
    public void rembourser(int quantite, CompteBanq compteVendeur, CompteBanq compteAcheteur) {

    }
}
