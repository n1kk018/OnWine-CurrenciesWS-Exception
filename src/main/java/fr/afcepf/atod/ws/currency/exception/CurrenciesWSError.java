package fr.afcepf.atod.ws.currency.exception;
/**
 * Errors thrown by the currencies ws.
 * @author nikko
 *
 */
public enum CurrenciesWSError {
    /**
     * Erreur générique.
     */
    CA_NE_FONCTIONNE_PAS,
    /**
     * Objet demandé non présent en base.
     */
    RECHERCHE_NON_PRESENTE_EN_BASE
}
