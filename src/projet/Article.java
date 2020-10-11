package projet;

public abstract class Article implements Ipublicite {

    String nom;
    float prix;
    String slogan;

    public Article(String _nom, float _prix, String _slogan) {
        nom = _nom;
        prix = _prix;
        slogan = _slogan;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String _nom) {
        nom = _nom;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float _prix) {
        prix = _prix;
    }

    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String _slogan) {
        slogan = _slogan;
    }

    public abstract void vendre(float quantite, CompteBanq compteVendeur, CompteBanq compteAcheteur) throws BanqSoldeInsuffisant;

}
