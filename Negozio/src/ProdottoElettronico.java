public class ProdottoElettronico implements Prodotto {
    protected int codice;
    protected String marca;
    protected double prezzo;
    protected int quantita;

    public ProdottoElettronico(int codice, String marca, double prezzo, int quantita) {
        this.codice = codice;
        this.marca = marca;
        this.prezzo = prezzo;
        this.quantita = quantita;
    }

    @Override
    public int getCodice() { return codice;}
    @Override
    public String getNome() { return marca;}
    @Override
    public double getPrezzo() { return prezzo;}
    @Override
    public int getQuantita() { return quantita;}
    @Override
    public void setPrezzo(double prezzo) { this.prezzo = prezzo;}
    @Override
    public void setQuantita(int quantita) { this.quantita = quantita; }

    @Override
    public String toString() {
        return "ProdottoElettronico [codice=" + codice + ", marca=" + marca +
                ", prezzo=" + prezzo + "€, quantita=" + quantita + "]";
    }
    @Override
    public ProdottoElettronico clone() throws CloneNotSupportedException {
        return (ProdottoElettronico) super.clone();
    }
}