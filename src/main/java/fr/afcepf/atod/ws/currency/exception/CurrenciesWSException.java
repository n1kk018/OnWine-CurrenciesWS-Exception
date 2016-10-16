package fr.afcepf.atod.ws.currency.exception;
/**
 * Custom exceptions for currencies converter ws.
 * @author nikko
 *
 */
public class CurrenciesWSException extends Exception {

    /**
     * serialization id.
     */
    private static final long serialVersionUID = 5420055711284173543L;
    /**
     * generic error.
     */
    private CurrenciesWSError wsError;
    /**
     * Constructor with a message.
     * @param message message
     */
    public CurrenciesWSException(String message) {
        super(message);
    }
    /**
     * Constructor with an error code and a message.
     * @param paramWsError error code
     * @param message message
     */
    public CurrenciesWSException(CurrenciesWSError paramWsError,
            String message) {
        super(message);
        wsError = paramWsError;
    }
    /**
     * public accessor for ws error.
     * @return wsError
     */
    public CurrenciesWSError getWsError() {
        return wsError;
    }
    /**
     * public mutator for ws error.
     * @param paramWsError wsError
     */
    public void setWsError(CurrenciesWSError paramWsError) {
        wsError = paramWsError;
    }
}
