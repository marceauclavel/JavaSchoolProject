package projet;

public class Iatos extends Personnel {

    private static int service = 192;

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////

    private float salaireFixe;
    private float heuresEffectuees;

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////

    public Iatos(String _nom, String _prenom, String _dateEntree, int _tempsDeTravail, int _salaireFixe, int _tauxHeuresSupplementaires) {
        super(_nom, _prenom, _dateEntree, _tempsDeTravail, _tauxHeuresSupplementaires);
        salaireFixe = _salaireFixe;
        heuresEffectuees = 0;
    }

    public Iatos(String _nom, String _prenom, String _numSecu, String _dateEntree, int _tempsDeTravail, int _salaireFixe, int _tauxHeuresSupplementaires) throws NumSecuException {
        super(_nom, _prenom, _numSecu, _dateEntree, _tempsDeTravail, _tauxHeuresSupplementaires);
        salaireFixe = _salaireFixe;
        heuresEffectuees = 0;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////

    public float getHeuresEffectuees() {
        return heuresEffectuees;
    }

    public void setHeuresEffectuees(int _heuresEffectuees) {
        heuresEffectuees = _heuresEffectuees;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////

    private float salaireFixe() {
        return salaireFixe * (super.tempsDeTravail / 100.f);
    }

    private float salaireVariable() {
        float bonus = 0;
        if (heuresEffectuees >= service) {
            bonus = (heuresEffectuees - service) * super.tauxHeuresSupplementaires;
        }
        return bonus;
    }

    public float calculSalaire() {
        return salaireFixe() + salaireVariable();
    }

}
