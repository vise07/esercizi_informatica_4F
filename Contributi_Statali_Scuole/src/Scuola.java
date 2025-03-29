import java.util.Objects;

public abstract class Scuola {
    protected String codice;
    protected String denominazione;
    protected String indirizzo;
    protected String citta;
    protected int numStudenti;
    protected int numClassi;
    protected int numSediAggiuntive;
    protected int numLaboratori;

    public Scuola(String codice, String denominazione, String indirizzo, String citta,
                  int numStudenti, int numClassi, int numSediAggiuntive, int numLaboratori) {
        this.codice = codice;
        this.denominazione = denominazione;
        this.indirizzo = indirizzo;
        this.citta = citta;
        this.numStudenti = numStudenti;
        this.numClassi = numClassi;
        this.numSediAggiuntive = numSediAggiuntive;
        this.numLaboratori = numLaboratori;
    }

    public abstract double calcolaContributo();

    @Override
    public String toString() {
        return String.format("Scuola: %s (%s)%n" +"Indirizzo: %s, %s%n" +"Studenti: %d | Classi: %d | Sedi aggiuntive: %d | Laboratori: %d%n" + "Contributo statale: €%,.2f%n", denominazione, codice, indirizzo, citta, numStudenti, numClassi, numSediAggiuntive, numLaboratori, calcolaContributo());
    }

    @Override
    public boolean equals(Object o) {
        if(!(o instanceof Scuola s)){
            return false;
        }
        return codice.equals(s.codice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codice);
    }
}