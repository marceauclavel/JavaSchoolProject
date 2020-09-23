package projet;

import java.util.Calendar;

public class Personne {

    private String nom;
    private String prenom;
    private String numSecu;
    private int anneeNaissance;
    private char sexe;
    private int deptNaissance;

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////

    public Personne(String _nom, String _prenom) {
        nom = _nom;
        prenom = _prenom;
        numSecu = "";
        anneeNaissance = 0;
        sexe = '\u0000';
        deptNaissance = 0;
    }

    public Personne(String _nom, String _prenom, String _numSecu) throws NumSecuException{
        nom = _nom;
        prenom = _prenom;
        if (_numSecu.length() >= 13 && _numSecu.length() <= 15){
            numSecu = _numSecu;
            anneeNaissance = anneeNaissance();
            sexe = sexe();
            deptNaissance = deptNaissance();
        } else {
            throw new NumSecuException();
        }
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

    public String getNumSecu() {
        return numSecu;
    }

    public void setNumSecu(String _numSecu) {
        numSecu = _numSecu;
        anneeNaissance = anneeNaissance();
        sexe = sexe();
        deptNaissance = deptNaissance();
    }

    public int getAnneeNaissance() {
        return anneeNaissance;
    }

    public char getSexe() {
        return sexe;
    }

    public int getDeptNaissance() {
        return deptNaissance;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////

    private int anneeNaissance() {
        int annee = 0;
        if (numSecu != "") {
            annee = Integer.parseInt(numSecu.substring(1, 3));
            if (annee > Calendar.getInstance().get(Calendar.YEAR) % 100) {
                annee += 1900;
            } else {
                annee += 2000;
            }
        }
        return annee;
    }

    private char sexe() {
        return (numSecu.charAt(0) == '1') ? 'M' : 'F';
    }

    private int deptNaissance() {
        return Integer.parseInt(numSecu.substring(5, 7));
    }

    public int calculAge() {
        int annee = Calendar.getInstance().get(Calendar.YEAR);
        return annee - anneeNaissance();
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////

    public String toString() {
        String repr = "Personne{nom='" + nom + '\'' + ", prenom='" + prenom + '\'';
        if (numSecu != "") {
            repr += ", numSecu=" + numSecu;
        }
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
