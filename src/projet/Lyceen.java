package projet;


public class Lyceen extends Enfant implements Scolaire {

    private static final String[] niveaux = {"2nd", "1ere", "terminale"};

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////

    private int niveau;
    private boolean examen;

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////

    public Lyceen(String _nom, String _prenom, int _niveau) {
        super(_nom, _prenom);
        niveau = _niveau;
        examen = grand();
    }

    public Lyceen(String _nom, String _prenom, int _anneeNaissance, char _sexe, int _deptNaissance, int _niveau) {
        super(_nom, _prenom, _anneeNaissance, _sexe, _deptNaissance);
        niveau = _niveau;
        examen = grand();
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////

    public int getNiveau() {
        return niveau;
    }

    public void setNiveau(int _niveau) {
        niveau = _niveau;
    }

    public boolean getExamen() {
        return examen;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////

    public boolean petit() {
        return (niveau == 0);
    }

    public boolean moyen() {
        return ((niveau > 0) && (niveau < 2));
    }

    public boolean grand() {
        return (niveau == 2);
    }

}
