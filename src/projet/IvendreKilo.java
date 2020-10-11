package projet;

public interface IvendreKilo {

    public void vendre(float quantite, CompteBanq compteVendeur, CompteBanq compteAcheteur) throws BanqSoldeInsuffisant;
    public void rembourser(float quantite, CompteBanq compteVendeur, CompteBanq compteAcheteur);

}
