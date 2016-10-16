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
    RECHERCHE_NON_PRESENTE_EN_BASE,
    /**
     * Ajout dans la base impossible.
     */
    IMPOSSIBLE_AJOUT_DANS_BASE,
    /**
     * Suppression dans la base impossible.
     */
    IMPOSSIBLE_SUPPRESSION_DANS_BASE,
    /**
     * L'update ne peut être faite.
     */
    UPDATE_NON_EFFECTUE_EN_BASE
}
