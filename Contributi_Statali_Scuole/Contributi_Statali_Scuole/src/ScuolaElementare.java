public class ScuolaElementare extends Scuola {
    private double CONTRIBUTO_PER_STUDENTE = 125;
    private double CONTRIBUTO_PER_SEDE = 9000;

    public ScuolaElementare(String codice, String denominazione, String indirizzo, String citta,
                            int numStudenti, int numClassi, int numSediAggiuntive, int numLaboratori) {
        super(codice, denominazione, indirizzo, citta, numStudenti, numClassi, numSediAggiuntive, numLaboratori);
    }

    @Override
    public double calcolaContributo() {
        return (numStudenti * CONTRIBUTO_PER_STUDENTE) + (numSediAggiuntive * CONTRIBUTO_PER_SEDE);
    }
}