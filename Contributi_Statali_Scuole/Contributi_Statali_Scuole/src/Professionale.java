public class Professionale extends ScuolaSuperiore {
    private double CONTRIBUTO_PER_CLASSE = 2400;
    private double CONTRIBUTO_PER_LABORATORIO = 3000;

    public Professionale(String codice, String denominazione, String indirizzo, String citta,
                         int numStudenti, int numClassi, int numSediAggiuntive, int numLaboratori) {
        super(codice, denominazione, indirizzo, citta, numStudenti, numClassi, numSediAggiuntive, numLaboratori);
    }

    @Override
    public double calcolaContributo() {
        return (numClassi * CONTRIBUTO_PER_CLASSE) + (numLaboratori * CONTRIBUTO_PER_LABORATORIO);
    }
}