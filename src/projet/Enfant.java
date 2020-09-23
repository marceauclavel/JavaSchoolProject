package projet;

import java.util.Calendar;

public class Enfant {

    private String nom;
    private String prenom;
    private int anneeNaissance;
    private char sexe;
    private int deptNaissance;

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////

    public Enfant(String _nom, String _prenom) {
            nom = _nom;
            prenom = _prenom;
            anneeNaissance = 0;
            sexe = '\u0000';
            deptNaissance = 0;
            }

    public Enfant(String _nom, String _prenom, int _anneeNaissance, char _sexe, int _deptNaissance) {
        nom = _nom;
        prenom = _prenom;
        anneeNaissance = _anneeNaissance;
        sexe = _sexe;
        deptNaissance = _deptNaissance;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////

    public String getNom() {
            return nom;
            }

    public void setNom(String _nom) {
            nom = _nom;
            }

    public String getPrenom() {
            return prenom;
            }

    public void setPrenom(String _prenom) {
            prenom = _prenom;
            }

    public int getAnneeNaissance() {
        return anneeNaissance;
    }

    public void setAnneeNaissance(int _anneeNaissance) {
        anneeNaissance = _anneeNaissance;
    }

    public char getSexe() {
        return sexe;
    }

    public void setSexe(char _sexe) {
        sexe = _sexe;
    }

    public int getDeptNaissance() {
        return deptNaissance;
    }

    public void setDeptNaissance(int _deptNaissance) {
        deptNaissance = _deptNaissance;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////

    public int calculAge() {
            int annee = Calendar.getInstance().get(Calendar.YEAR);
            return annee - anneeNaissance;
            }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////

    public String toString() {
            String repr = "Personne{nom='" + nom + '\'' + ", prenom='" + prenom + '\'';
            if (anneeNaissance != 0) {
            repr += ", anneeNaissance=" + anneeNaissance;
            }
            if (sexe != '\u0000') {
            repr += ", sexe=" + sexe;
            }
            if (deptNaissance != 0) {
            repr += ", deptNaissance=" + deptNaissance;
            }
            repr += '}';
            return repr;
            }
}
