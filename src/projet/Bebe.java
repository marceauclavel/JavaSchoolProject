package projet;

public class Bebe extends Enfant{
    public Bebe(String _nom, String _prenom) {
        super(_nom, _prenom);
    }

    public Bebe(String _nom, String _prenom, int _anneeNaissance, char _sexe, int _deptNaissance) {
        super(_nom, _prenom, _anneeNaissance, _sexe, _deptNaissance);
    }
}
