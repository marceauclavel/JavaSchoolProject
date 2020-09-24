package projet;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

    public Test() {
        try {
            //testPersonne();
            //testCompteBanq();
            testEleveDigital();
            // testIatos();
            //testEnseignant();
            // testEnfant();
            testException1();
            testException2();

        } catch (NumSecuException e) {
            System.out.println(e.getMessage());
        } catch (BanqCodeException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Internal problem");
        }
    }

    public void testPersonne() throws NumSecuException{
        Personne personne;
        personne = new Personne("Clavel", "Marceau", "19608680665453");
        System.out.println(personne);
        System.out.println("Age: " + personne.calculAge());
    }

    public void testCompteBanq() throws NumSecuException, BanqCodeException {
        Personne personne = new Personne("Clavel", "Marceau", "19608680665453");
        CompteBanq compte = new CompteBanq("0", personne, "0000", "1234");
        System.out.println("Solde: " + compte.getSolde());
        boolean ask = true;
        Scanner entree = new Scanner(System.in);
        while (ask) {
            System.out.print("Virement(V) ou Retrait(R) ?");
            switch (entree.nextLine()) {
                case "V":
                    System.out.print("Quel est le montant du virement ?");
                    compte.versement(Float.parseFloat(entree.nextLine()));
                    ask = false;
                    break;
                case "R":
                    System.out.print("Quel est le montant du retrait ?");
                    compte.retrait(Float.parseFloat(entree.nextLine()));
                    ask = false;
                    break;
            }
        }
        System.out.println("\n" + "Solde: " + compte.getSolde());
    }

    public void testEleveDigital() throws NumSecuException{
        EleveDigital eleve;
        Note note1 =  new Note("Maths", 14, 5);
        Note note2 =  new Note("Physique", 16, 5);
        Note note3 =  new Note("Anglais", 11, 5);
        eleve = new EleveDigital("Clavel", "Marceau", "19608680665453", 12345678, 2020, 3);
        eleve.ajouteNote(note1);
        eleve.ajouteNote(note2);
        eleve.ajouteNote(note3);
        System.out.println("\n" + "L'eleve: " + eleve + "\n a les notes suivantes:\n" + eleve.getNotes());
    }

    public void testIatos() throws NumSecuException{
        Iatos iatos1 = new Iatos("Dupont", "Brigitte", "25 Janvier 2011", 100, 2000, 12);
        Iatos iatos2 = new Iatos("Vasque", "Hubert", "13 Decembre 2003", 80, 2000, 14);
        iatos1.setHeuresEffectuees(200);
        iatos2.setHeuresEffectuees(223);
        System.out.println("\n" + iatos1.getPrenom() + " a eu un salaire de :\n" + iatos1.calculSalaire());
        System.out.println("\n" + iatos2.getPrenom() + " a eu un salaire de :\n" + iatos2.calculSalaire());
        System.out.println(iatos2);
    }

    public void testEnseignant() throws NumSecuException{
        Enseignant enseignant1 = new Enseignant("Dupont", "Brigitte", "25 Janvier 2011", 100, "PROF");
        Enseignant enseignant2 = new Enseignant("Vasque", "Hubert", "13 Decembre 2003",100, "PRAG");
        enseignant1.setHeuresEffectuees(200);
        enseignant2.setHeuresEffectuees(384);
        enseignant2.setDechargeHeures(1);
        System.out.println("\n" + enseignant1.getPrenom() + " a eu un salaire de :\n" + enseignant1.calculSalaire());
        System.out.println("\n" + enseignant2.getPrenom() + " a eu un salaire de :\n" + enseignant2.calculSalaire());
    }

    public void testEnfant() {
        ArrayList<Enfant> enfants = new ArrayList<Enfant>();
        enfants.add(new Bebe("Jambe", "Alix"));
        enfants.add(new Ecolier("Baobab", "Eude",2));
        enfants.add(new Collegien("Poudre", "Jean",2));
        enfants.add(new Lyceen("Pates", "Scoluia",2));

        for (Enfant e : enfants) {
            if (Scolaire.class.isInstance(e)) {
                System.out.println("L'enfant " + e.getPrenom() + " " + e.getNom() + " est scolaire.");
            } else {
                System.out.println("L'enfant " + e.getPrenom() + " " + e.getNom() + " n'est pas scolaire.");
            }
        }

        Collegien collegien = (Collegien) enfants.get(2);
        Lyceen lyceen = (Lyceen) enfants.get(3);

        System.out.println("L'enfant " + collegien.getPrenom() + " " + collegien.getNom() + ((collegien.getExamen()) ? " as un examen." : " n'as pas d'examen."));
        System.out.println("L'enfant " + lyceen.getPrenom() + " " + lyceen.getNom() + ((lyceen.getExamen()) ? " as un examen." : " n'as pas d'examen."));

    }

    public void testException1() throws NumSecuException{
        Enseignant enseignant1 = new Enseignant("Dupont", "Brigitte", "123456789", "25 Janvier 2011", 100, "PROF");
    }

    public void testException2() throws NumSecuException, BanqCodeException {
        Personne personne = new Personne("Clavel", "Marceau", "19608680665453");
        CompteBanq compte = new CompteBanq("0", personne, "0000", "1234");
        System.out.println("Solde: " + compte.getSolde());
        boolean ask = true;
        Scanner entree = new Scanner(System.in);
        while (ask) {
            System.out.print("Virement(V) ou Retrait(R) ?");
            switch (entree.nextLine()) {
                case "V":
                    System.out.print("Quel est le montant du virement ?");
                    compte.versement(Float.parseFloat(entree.nextLine()));
                    ask = false;
                    break;
                case "R":
                    System.out.print("Quel est le montant du retrait ?");
                    compte.retrait(Float.parseFloat(entree.nextLine()));
                    ask = false;
                    break;
            }
        }
        System.out.println("\n" + "Solde: " + compte.getSolde());
    }

}
