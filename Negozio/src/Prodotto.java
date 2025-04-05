public interface Prodotto extends Cloneable {
    int getCodice();
    String getNome();
    double getPrezzo();
    int getQuantita();
    void setPrezzo(double prezzo);
    void setQuantita(int quantita);
    Prodotto clone() throws CloneNotSupportedException;
}