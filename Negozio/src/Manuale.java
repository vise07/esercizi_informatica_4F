public class Manuale extends Libro {
    private String argomento;

    public Manuale(String nome, String descrizione, String autore, String isbn, double prezzo, int quantita, String argomento) {
        super(nome, descrizione, autore, isbn, prezzo, quantita);
        this.argomento = argomento;
    }

    public String getArgomento() {
        return argomento;
    }

    @Override
    public String toString() {
        return super.toString() + ", Argomento: " + argomento;
    }

    @Override
    public Manuale clone() {
        return (Manuale) super.clone();
    }
}