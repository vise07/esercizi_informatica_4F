public class Libro implements Prodotto {
    protected int codice;
    protected String nome;
    protected String descrizione;
    protected String autore;
    protected double prezzo;
    protected int quantita;

    public Libro(int codice, String nome, String descrizione, String autore, double prezzo, int quantita) {
        this.codice = codice;
        this.nome = nome;
        this.descrizione = descrizione;
        this.autore = autore;
        this.prezzo = prezzo;
        this.quantita = quantita;
    }

    @Override
    public int getCodice() {
        return codice;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public double getPrezzo() {
        return prezzo;
    }

    @Override
    public int getQuantita() {
        return quantita;
    }

    @Override
    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    @Override
    public void setQuantita(int quantita) {
        this.quantita = quantita;
    }

    @Override
    public String toString() {
        return "Libro [codice=" + codice + ", nome=" + nome + ", autore=" + autore +
                ", prezzo=" + prezzo + "€, quantita=" + quantita + "]";
    }
    @Override
    public Libro clone() throws CloneNotSupportedException {
        return (Libro) super.clone();
    }
}