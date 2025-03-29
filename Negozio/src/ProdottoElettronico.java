public abstract class ProdottoElettronico implements Prodotto {
    private String codiceProdotto;
    private String marca;
    private double prezzo;

    public ProdottoElettronico(String codiceProdotto, String marca, double prezzo) {
        this.codiceProdotto = codiceProdotto;
        this.marca = marca;
        this.prezzo = prezzo;
    }

    @Override
    public String getCodice() {
        return codiceProdotto;
    }

    public String getMarca() {
        return marca;
    }

    @Override
    public double getPrezzo() {
        return prezzo;
    }

    @Override
    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    @Override
    public String toString() {
        return String.format("Codice: %s, Marca: %s, Prezzo: %.2f", codiceProdotto, marca, prezzo);
    }

    @Override
    public ProdottoElettronico clone() {
        try {
            return (ProdottoElettronico) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}