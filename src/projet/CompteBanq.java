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
        System.out.print("Entrez votre code 1");
        if (entree.nextLine().equals(code1)) {
            solde = _solde;
            System.out.print("Operation autorisée");
        } else {
            throw new BanqCodeException("code 1");
        }

    }

    public float getDecouvertAutorise() {
        return decouvertAutorise;
    }

    public void setDecouvertAutorise(float _decouvertAutorise) throws BanqCodeException {
        Scanner entree = new Scanner(System.in);
        System.out.print("Entrez votre code 1");
        if (entree.nextLine() == code1) {
            decouvertAutorise = _decouvertAutorise;
            System.out.print("Operation autorisée");
        } else {
            throw new BanqCodeException("code 2");
        }
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void versement(float montant) throws BanqCodeException {
        setSolde(getSolde() + montant);
    }

    public void retrait(float montant) throws BanqCodeException {
        if (solde - montant > decouvertAutorise) {
            setSolde(getSolde() - montant);
        } else {
            System.out.print("Solde insufisant");
        }
    }

}
