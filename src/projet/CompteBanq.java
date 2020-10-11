package projet;

import java.util.Scanner;

public class CompteBanq {

    private String num;
    private Personne client;
    private float solde;
    private float decouvertAutorise;
    private String code1;
    private String code2;

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////

    public CompteBanq(String _num, Personne _client, String _code1, String _code2) {
        num = _num;
        client = _client;
        code1 = _code1;
        code2 = _code2;
        solde = 0;
        decouvertAutorise = 0;
        Store store =  new Store();
        store.save(code1, num+"code1");
        store.save(code2, num+"code2");
        store = null;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////

    public String getNum() {
        return num;
    }

    public Personne getClient() {
        return client;
    }

    public float getSolde() {
        return solde;
    }

    public void setSolde(float _solde) throws BanqCodeException{
        Scanner entree = new Scanner(System.in);
        System.out.print("\n" + client.getNom() + ", entrez votre code 1");
        //if (entree.nextLine().equals(code1)) {
        if (true) {
            solde = _solde;
            System.out.print("\nOperation autorisée");
        } else {
            throw new BanqCodeException("code 1");
        }

    }

    public float getDecouvertAutorise() {
        return decouvertAutorise;
    }

    public void setDecouvertAutorise(float _decouvertAutorise) throws BanqCodeException {
        Scanner entree = new Scanner(System.in);
        System.out.print("\n" + client.getNom() + ", entrez votre code 2");
        Store store =  new Store();
        String storedCode2 = store.load(num+"code2");
        if (entree.nextLine().equals(storedCode2)) {
        //if (true) {
            decouvertAutorise = _decouvertAutorise;
            System.out.print("\nOperation autorisée");
        } else {
            throw new BanqCodeException("code 2");
        }
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void versement(float montant) throws BanqCodeException {
        setSolde(getSolde() + montant);
    }

    public boolean retrait(float montant) throws BanqCodeException, BanqSoldeInsuffisant {
        boolean operationEffectuee = false;
        if (solde - montant > decouvertAutorise) {
            setSolde(getSolde() - montant);
            operationEffectuee = true;
        } else {
            throw new BanqSoldeInsuffisant("\nSolde insufisant");
        }
        return operationEffectuee;
    }

}
