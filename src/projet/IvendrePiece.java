package projet;

public interface IvendrePiece {

    public void vendre(float quantite, CompteBanq compteVendeur, CompteBanq compteAcheteur) throws BanqSoldeInsuffisant;
    public void rembourser(int quantite, CompteBanq compteVendeur, CompteBanq compteAcheteur);

}
