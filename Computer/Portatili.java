package computer;

public class Portatili extends Computer {

    // Attributi
    private int peso, altezza, larghezza, profondita, dimensioniVideo;
    private tipi tipo;

    // Costruttore
    public Portatili(String processore, int ram, int memoriaMassa, String marca, String modello, String SO, int peso, int altezza, int larghezza, int profondita, int dimensioniVideo, tipi tipo) {
        super(processore, ram, memoriaMassa, marca, modello, SO);
        this.peso = peso;
        this.altezza = altezza;
        this.larghezza = larghezza;
        this.profondita = profondita;
        this.dimensioniVideo = dimensioniVideo;
        this.tipo = tipo;
    }

    // Getter e Setter
    public int getPeso() {
        return peso;
    }

    public int getAltezza() {
        return altezza;
    }

    public int getLarghezza() {
        return larghezza;
    }

    public int getProfondita() {
        return profondita;
    }

    public int getDimensioniVideo() {
        return dimensioniVideo;
    }

    public tipi getTipo() {
        return tipo;
    }

    // Metodo toString
    @Override
    public String toString() {
        return super.toString() + String.format(", Peso %d, Altezza: %d, Larghezza: %d, Profondità: %d, Dimensioni del video: %d", peso, altezza, larghezza, profondita, dimensioniVideo);
    }

    // Metodo equals
    @Override
    public boolean equals(Object o) {
        if(!(o instanceof Portatili computer)){
            return false;
        }else{
            return super.equals(computer) && peso == computer.peso && dimensioniVideo == computer.dimensioniVideo;
        }
    }
}