import java.util.Scanner;
import java.util.ArrayList;

public class FrontEnd {
    private static int codice = 0;
    private static ArrayList<Prodotto> prodotti = new ArrayList<>();

    /**
     * Permette l'inserimento di uno smartphone.
     *
     * @param sc Scanner utilizzato per la lettura dell'input dell'utente.
     * @return Lo smartphone inserito.
     * @throws Exception Se i dati inseriti non sono validi.
     */
    public static Prodotto inserimentoSmartphone(Scanner sc) throws Exception {
        System.out.println("Inserire la marca dello smartphone");
        String marca = sc.nextLine();
        System.out.println("Inserire il modello dello smartphone");
        String modello = sc.nextLine();
        System.out.println("Inserire la memoria (GB)");
        int memoria = Integer.parseInt(sc.nextLine());
        if (memoria <= 0) throw Eccezioni.MEMORIANONVALIDA;

        System.out.println("Inserire il prezzo");
        double prezzo = Double.parseDouble(sc.nextLine());
        if (prezzo <= 0) throw Eccezioni.PREZZONONVALIDO;

        System.out.println("Inserire la quantità");
        int quantita = Integer.parseInt(sc.nextLine());
        if (quantita < 0) throw Eccezioni.QUANTITANONVALIDA;

        int nuovoCodice = ++codice;
        if (esisteCodice(nuovoCodice)) throw Eccezioni.CODICEESISTENTE;

        Smartphone smartphone = new Smartphone(nuovoCodice, marca, prezzo, quantita, modello, memoria);
        prodotti.add(smartphone.clone());
        return smartphone;
    }

    public static Prodotto inserimentoManuale(Scanner sc) throws Exception {
        System.out.println("Inserire il titolo del manuale");
        String titolo = sc.nextLine();
        System.out.println("Inserire la descrizione del manuale");
        String descrizione = sc.nextLine();
        System.out.println("Inserire l'autore del manuale");
        String autore = sc.nextLine();

        System.out.println("Inserire il prezzo");
        double prezzo = Double.parseDouble(sc.nextLine());
        if (prezzo <= 0) throw Eccezioni.PREZZONONVALIDO;

        System.out.println("Inserire la quantità");
        int quantita = Integer.parseInt(sc.nextLine());
        if (quantita < 0) throw Eccezioni.QUANTITANONVALIDA;

        System.out.println("Inserire l'argomento del manuale");
        String argomento = sc.nextLine();

        int nuovoCodice = ++codice;
        if (esisteCodice(nuovoCodice)) throw Eccezioni.CODICEESISTENTE;

        Manuale manuale = new Manuale(nuovoCodice, titolo, descrizione, autore, prezzo, quantita, argomento);
        prodotti.add(manuale.clone());
        return manuale;
    }


    public static Prodotto ricercaProdotto(int codice) {
        for (Prodotto p : prodotti) {
            if (p.getCodice() == codice) {
                return p;
            }
        }
        return null;
    }

    public static void modificaPrezzo(int codice, double nuovoPrezzo) throws Exception {
        Prodotto p = ricercaProdotto(codice);
        if (p == null) throw Eccezioni.PRODOTTONONPRESENTE;
        if (nuovoPrezzo <= 0) throw Eccezioni.PREZZONONVALIDO;
        p.setPrezzo(nuovoPrezzo);
    }

    public static void modificaQuantita(int codice, int nuovaQuantita) throws Exception {
        Prodotto p = ricercaProdotto(codice);
        if (p == null) throw Eccezioni.PRODOTTONONPRESENTE;
        if (nuovaQuantita < 0) throw Eccezioni.QUANTITANONVALIDA;
        p.setQuantita(nuovaQuantita);
    }

    public static boolean rimuoviProdotto(int codice) {
        for (int i = 0; i < prodotti.size(); i++) {
            if (prodotti.get(i).getCodice() == codice) {
                prodotti.remove(i);
                return true;
            }
        }
        return false;
    }

    private static boolean esisteCodice(int codice) {
        for (Prodotto p : prodotti) {
            if (p.getCodice() == codice) {
                return true;
            }
        }
        return false;
    }

    public static ArrayList<Prodotto> visualizzaProdotti() throws CloneNotSupportedException {
        ArrayList<Prodotto> lista = new ArrayList<>();
        for(Prodotto p1 : prodotti) {
            lista.add(p1.clone());
        }
        return lista;
    }
}