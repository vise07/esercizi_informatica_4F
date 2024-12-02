public class Frazione {

    // Attributi
    private int numeratore;
    private int denominatore;


    // Costruttore della frazione
    public Frazione(int numeratore, int denominatore) {
        setDenominatore(denominatore);
        setNumeratore(numeratore);
    }


    // Getter e Setter del numeratore e denominatore
    public int getNumeratore() {
        return numeratore;
    }
    public void setNumeratore(int numeratore) {
        this.numeratore = numeratore;
    }

    public int getDenominatore() {
        return denominatore;
    }
    public void setDenominatore(int denominatore) {
        if (denominatore == 0) {
            throw new IllegalArgumentException("Il denominatore non può essere zero");
        }
        this.denominatore = denominatore;
    }


    // Metodo per sommare due frazioni e ritornare una nuova frazione
    public Frazione sommaFrazioni(Frazione f2) {
        int num = (this.numeratore * f2.denominatore) + (f2.numeratore * this.denominatore);
        int den = this.denominatore * f2.denominatore;
        return new Frazione(num, den);
    }


    // Metodo per sommare due frazioni e ritornare il risultato in formato decimale
    public double sommaFrazioniInDecimale(Frazione f2) {
        return (double) (this.numeratore * f2.denominatore + f2.numeratore * this.denominatore) / (this.denominatore * f2.denominatore);
    }


    // Metodo per visualizzare la frazione in formato "numeratore/denominatore"
    public void visualizzaFrazione() {
        System.out.println(this.numeratore + "/" + this.denominatore);
    }


    // Metodo per visualizzare il risultato della frazione in formato decimale
    public void visualizzaDecimale() {
        double decimale = (double) numeratore / denominatore;
        System.out.println(decimale);
    }
}
