package projet;

public interface IvendrePiece {

    public void vendre(int quantite, CompteBanq compteVendeur, CompteBanq compteAcheteur);
    public void rembourser(int quantite, CompteBanq compteVendeur, CompteBanq compteAcheteur);

}
