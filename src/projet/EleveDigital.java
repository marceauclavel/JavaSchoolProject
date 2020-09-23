package projet;

import java.util.ArrayList;

public class EleveDigital extends Eleve {

    private ArrayList<Note> notes = new ArrayList<Note>();

    public EleveDigital(String _nom, String _prenom, int _ine, int _promo, int _annee) {
        super(_nom, _prenom, _ine, _promo, _annee);
    }

    public EleveDigital(String _nom, String _prenom, String _numSecu, int _ine, int _promo, int _annee) throws NumSecuException{
        super(_nom, _prenom, _numSecu, _ine, _promo, _annee);
    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////

    public ArrayList<Note> getNotes() {
        return notes;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void ajouteNote(Note note) {
        notes.add(note);
    }

}
