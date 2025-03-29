public class Tecnico extends ScuolaSuperiore {
    private double CONTRIBUTO_PER_CLASSE = 3500;
    private double CONTRIBUTO_PER_LABORATORIO = 6000;

    public Tecnico(String codice, String denominazione, String indirizzo, String citta,
                   int numStudenti, int numClassi, int numSediAggiuntive, int numLaboratori) {
        super(codice, denominazione, indirizzo, citta, numStudenti, numClassi, numSediAggiuntive, numLaboratori);
    }

    @Override
    public double calcolaContributo() {
        return (numClassi * CONTRIBUTO_PER_CLASSE) + (numLaboratori * CONTRIBUTO_PER_LABORATORIO);
    }
}