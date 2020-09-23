package projet;

public class Eleve extends Personne{

    int ine;
    int promo;
    int annee;

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////

    public Eleve(String _nom, String _prenom, int _ine, int _promo, int _annee) {
        super(_nom, _prenom);
        ine = _ine;
        promo = _promo;
        annee = _annee;
    }

    public Eleve(String _nom, String _prenom, String _numSecu, int _ine, int _promo, int _annee) throws NumSecuException {
        super(_nom, _prenom, _numSecu);
        ine = _ine;
        promo = _promo;
        annee = _annee;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////

    public int getIne() {
        return ine;
    }

    public void setIne(int _ine) {
        ine = _ine;
    }

    public int getPromo() {
        return promo;
    }

    public void setPromo(int _promo) {
        promo = _promo;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int _annee) {
        annee = _annee;
    }
}
