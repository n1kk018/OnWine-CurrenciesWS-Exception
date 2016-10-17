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
    private CurrenciesWSError wsError = CurrenciesWSError.CA_NE_FONCTIONNE_PAS;
    /**
     * Default Constructor.
     */
    public CurrenciesWSException() {
        super();
    }
    /**
     * Constructor with an error code and a message.
     * @param paramMessage le message
     * @param paramWsError le code d'erreur
     */
    public CurrenciesWSException(String paramMessage,
            CurrenciesWSError paramWsError) {
        super(paramMessage);
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