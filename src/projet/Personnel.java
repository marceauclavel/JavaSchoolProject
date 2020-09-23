package projet;

public class Personnel extends Personne {

    private String dateEntree;
    protected int tempsDeTravail;
    private int heuresSupplementaires;
    protected float tauxHeuresSupplementaires;

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////

    public Personnel(String _nom, String _prenom, String _dateEntree, int _tempsDeTravail, float _tauxHeuresSupplementaires) {
        super(_nom, _prenom);
        dateEntree = _dateEntree;
        tempsDeTravail = _tempsDeTravail;
        heuresSupplementaires = 0;
        tauxHeuresSupplementaires = _tauxHeuresSupplementaires;
    }

    public Personnel(String _nom, String _prenom, String _numSecu, String _dateEntree, int _tempsDeTravail, float _tauxHeuresSupplementaires) throws NumSecuException {
        super(_nom, _prenom, _numSecu);
        dateEntree = _dateEntree;
        tempsDeTravail = _tempsDeTravail;
        heuresSupplementaires = 0;
        tauxHeuresSupplementaires = _tauxHeuresSupplementaires;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////

    public String getDateEntree() {
        return dateEntree;
    }

    public void setDateEntree(String _dateEntree) {
        dateEntree = _dateEntree;
    }

    public int getTempsDeTravail() {
        return tempsDeTravail;
    }

    public void setTempsDeTravail(int _tempsDeTravail) {
        tempsDeTravail = _tempsDeTravail;
    }

    public int getHeuresSupplementaires() {
        return heuresSupplementaires;
    }

    public void setHeuresSupplementaires(int _heuresSupplementaires) {
        heuresSupplementaires = _heuresSupplementaires;
    }

    public float getTauxHeuresSupplementaires() {
        return tauxHeuresSupplementaires;
    }

    public void setTauxHeuresSupplementaires(float _tauxHeuresSupplementaires) {
        tauxHeuresSupplementaires = _tauxHeuresSupplementaires;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////

    public float calculSalaire(){
        return 0;
    };

}
