package projet;

public class Enseignant extends Personnel{

    private static float tauxHeuresSupplementairesEnseignant = 10;
    private static float primeEnseignant = 888;
    private static float salaireFixePRAG = 4000;
    private static float salaireFixeMDC = 2000;
    private static float salaireFixePROF = 1000;
    private static int servicePRAG = 384;
    private static int serviceMDC = 192;
    private static int servicePROF = 96;

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////

    private String echelon;
    private float salaireFixe;
    private int service;
    private int heuresEffectuees;
    private int dechargeHeures;

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////

    public Enseignant(String _nom, String _prenom, String _dateEntree, int _tempsDeTravail, String _echelon) {
        super(_nom, _prenom, _dateEntree, _tempsDeTravail, tauxHeuresSupplementairesEnseignant);
        setEchelon(_echelon);
        heuresEffectuees = 0;
        dechargeHeures = 0;
    }

    public Enseignant(String _nom, String _prenom, String _numSecu, String _dateEntree, int _tempsDeTravail, String _echelon) throws NumSecuException{
        super(_nom, _prenom, _numSecu, _dateEntree, _tempsDeTravail, tauxHeuresSupplementairesEnseignant);
        setEchelon(_echelon);
        heuresEffectuees = 0;
        dechargeHeures = 0;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////

    public String getEchelon() {
        return echelon;
    }

    public void setEchelon(String _echelon) {
        echelon = _echelon;
        switch (echelon) {
            case "PRAG":
                salaireFixe = salaireFixePRAG;
                service = servicePRAG;
                break;
            case "MDC":
                salaireFixe = salaireFixeMDC;
                service = serviceMDC;
                break;
            case "PROF":
                salaireFixe = salaireFixePROF;
                service = servicePROF;
                break;
            default:
                salaireFixe = 0;
                service = 0;
                break;
        }
    }

    public int getHeuresEffectuees() {
        return heuresEffectuees;
    }

    public void setHeuresEffectuees(int _heuresEffectuees) {
        heuresEffectuees = _heuresEffectuees;
    }

    public int getDechargeHeures() {
        return dechargeHeures;
    }

    public void setDechargeHeures(int _dechargeHeures) {
        dechargeHeures = _dechargeHeures;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////

    private float salaireFixe() {
        return salaireFixe * (tempsDeTravail / 100.f);
    }

    private int salaireVariable() {
        int bonus = 0;
        if (heuresEffectuees + dechargeHeures >= service) {
            bonus += primeEnseignant;
            bonus += (heuresEffectuees + dechargeHeures - service) * tauxHeuresSupplementaires;
        }
        return bonus;
    }

    public float calculSalaire() {
        return salaireFixe() + salaireVariable();
    }
}
