package projet;

public class Ecolier extends Enfant implements Scolaire{

    private static final String[] niveaux = {"CP", "CE1", "CE2", "CM1", "CM2"};

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////

    private int niveau;

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////

    public Ecolier(String _nom, String _prenom, int _niveau) {
        super(_nom, _prenom);
        niveau = _niveau;
    }

    public Ecolier(String _nom, String _prenom, int _anneeNaissance, char _sexe, int _deptNaissance,  int _niveau) {
        super(_nom, _prenom, _anneeNaissance, _sexe, _deptNaissance);
        niveau = _niveau;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////

    public int getNiveau() {
        return niveau;
    }

    public void setNiveau(int _niveau) {
        niveau = _niveau;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////

    public boolean petit() {
        return (niveau == 0);
    }

    public boolean moyen() {
        return ((niveau > 0) && (niveau < 4));
    }

    public boolean grand() {
        return (niveau == 4);
    }

}
