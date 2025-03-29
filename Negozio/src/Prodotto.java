public interface Prodotto extends Cloneable {
    String getCodice();
    double getPrezzo();
    void setPrezzo(double prezzo);
    String toString();
    Prodotto clone();
}