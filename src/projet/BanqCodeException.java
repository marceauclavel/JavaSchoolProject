package projet;

public class BanqCodeException extends Exception {

    String whichCode;

    public BanqCodeException(String _whichCode) {
        super();
        whichCode = _whichCode;
    }

    @Override
    public String getMessage() {
        return (whichCode + " invalide.");
    }
}
