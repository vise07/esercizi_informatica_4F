public class Smartphone extends ProdottoElettronico {
    private String modello;
    private int memoria;

    public Smartphone(int codice, String marca, double prezzo, int quantita, String modello, int memoria) {
        super(codice, marca, prezzo, quantita);
        this.modello = modello;
        this.memoria = memoria;
    }

    @Override
    public String toString() {
        return "Smartphone [modello=" + modello + ", memoria=" + memoria + "GB, " + super.toString();
    }
    @Override
    public Smartphone clone() throws CloneNotSupportedException {
        return (Smartphone) super.clone();
    }

}