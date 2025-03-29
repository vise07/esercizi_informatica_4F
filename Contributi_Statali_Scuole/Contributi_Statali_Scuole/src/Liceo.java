public class Liceo extends ScuolaSuperiore {
    private double CONTRIBUTO_PER_STUDENTE = 150;
    private double CONTRIBUTO_PER_LABORATORIO = 1100;

    public Liceo(String codice, String denominazione, String indirizzo, String citta,
                 int numStudenti, int numClassi, int numSediAggiuntive, int numLaboratori) {
        super(codice, denominazione, indirizzo, citta, numStudenti, numClassi, numSediAggiuntive, numLaboratori);
    }

    @Override
    public double calcolaContributo() {
        return (numStudenti * CONTRIBUTO_PER_STUDENTE) + (numLaboratori * CONTRIBUTO_PER_LABORATORIO);
    }
}