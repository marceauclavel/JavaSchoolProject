package projet;

public class Note {

    private String matiere;
    private float note;
    private float credit;
    private boolean validation;

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////

    public Note(String _matiere, float _note, float _credit) {
        matiere = _matiere;
        note = _note;
        credit = _credit;
        validation = validation();
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////

    public String getMatiere() {
        return matiere;
    }

    public float getNote() {
        return note;
    }


    public float getCredit() {
        return credit;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////

    private boolean validation() {
        return (note >= 10);
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////

    public String toString() {
        return "Note{" +
                "matiere='" + matiere + '\'' +
                ", note=" + note +
                '}';
    }
}
