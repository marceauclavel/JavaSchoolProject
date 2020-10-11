package projet;

public class BanqSoldeInsuffisant extends Exception{

    public BanqSoldeInsuffisant() {
    }

    public BanqSoldeInsuffisant(String message) {
        super(message);
    }
}
