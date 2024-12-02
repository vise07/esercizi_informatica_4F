import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {

            /*
            int num1, num2, den1, den2;

            System.out.println("Inserisci il numeratore della prima frazione");
            num1 = Integer.parseInt(sc.nextLine());
            System.out.println("Inserisci il denominatore della prima frazione");
            den1 = Integer.parseInt(sc.nextLine());
            System.out.println("Inserisci il numeratore della seconda frazione");
            num2 = Integer.parseInt(sc.nextLine());
            System.out.println("Inserisci il denominatore della seconda frazione");
            den2 = Integer.parseInt(sc.nextLine());

            Frazione f1 = new Frazione(num1, den1);
            Frazione f2 = new Frazione(num2, den2);
            */

            Frazione f1 = new Frazione(1, 4); // Frazione 1/4
            Frazione f2 = new Frazione(1, 2); // Frazione 1/2

            // Somma fra frazioni numeriche
            Frazione somma = f1.sommaFrazioni(f2);
            System.out.print("Somma delle frazioni: ");
            somma.visualizzaFrazione(); // Visualizza 6/8

            // Somma delle frazioni in formato decimale
            double sommaDecimale = f1.sommaFrazioniInDecimale(f2);
            System.out.print("Somma in formato decimale: ");
            System.out.println(sommaDecimale); // Visualizza 0.75

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
