public class Main {
    public static void main(String[] args) {
        Frazione f1 = new Frazione(1, 4); // Frazione 1/4
        Frazione f2 = new Frazione(1, 2); // Frazione 1/2

        // Somma fra frazioni numeriche
        Frazione somma = f1.sommaFrazioni(f2);
        System.out.print("Somma delle frazioni: ");
        somma.visualizzaFrazione(); // Visualizza 6/8

        // Somma delle frazioni in formato decimale
        double sommaDecimale = f1.sommaFrazioniDecimal(f2);
        System.out.print("Somma in formato decimale: ");
        System.out.println(sommaDecimale); // Visualizza 0.75
    }
}