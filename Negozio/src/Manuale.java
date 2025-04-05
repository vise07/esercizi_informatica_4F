public class Manuale extends Libro {
    private String argomento;

    public Manuale(int codice, String nome, String descrizione, String autore,
                   double prezzo, int quantita, String argomento) {
        super(codice, nome, descrizione, autore, prezzo, quantita);
        this.argomento = argomento;
    }

    @Override
    public String toString() {
        return "Manuale [argomento=" + argomento + ", " + super.toString();
    }
    @Override
    public Manuale clone() throws CloneNotSupportedException {
        return (Manuale) super.clone();
    }
}