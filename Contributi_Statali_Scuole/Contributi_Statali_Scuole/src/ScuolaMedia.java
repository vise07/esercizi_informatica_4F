public class ScuolaMedia extends Scuola {
    private double CONTRIBUTO_PER_STUDENTE = 150;
    private double CONTRIBUTO_PER_LABORATORIO = 1100;
    private double CONTRIBUTO_PER_SEDE = 9000;

    public ScuolaMedia(String codice, String denominazione, String indirizzo, String citta,
                       int numStudenti, int numClassi, int numSediAggiuntive, int numLaboratori) {
        super(codice, denominazione, indirizzo, citta, numStudenti, numClassi, numSediAggiuntive, numLaboratori);
    }

    @Override
    public double calcolaContributo() {
        return (numStudenti * CONTRIBUTO_PER_STUDENTE) +
                (numLaboratori * CONTRIBUTO_PER_LABORATORIO) +
                (numSediAggiuntive * CONTRIBUTO_PER_SEDE);
    }
}