public class Eccezioni extends Exception {
    public static final Eccezioni CODICEESISTENTE = new Eccezioni("Codice già esistente");
    public static final Eccezioni PRODOTTONONPRESENTE = new Eccezioni("Prodotto non presente");
    public static final Eccezioni MEMORIANONVALIDA = new Eccezioni("Memoria deve essere > 0");
    public static final Eccezioni PREZZONONVALIDO = new Eccezioni("Prezzo deve essere > 0");
    public static final Eccezioni QUANTITANONVALIDA = new Eccezioni("Quantità non valida");

    private Eccezioni(String message) {
        super(message);
    }
}