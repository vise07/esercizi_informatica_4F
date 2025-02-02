package computer;

public class PCfissi extends Computer {

    // Attributi
    private Contenitore contenitore;
    private String schedaVideo;
    private tipi tipo;

    // Costruttore
    public PCfissi(String processore, int ram, int memoriaMassa, String marca, String modello, String SO, Contenitore contenitore, String schedaVideo, tipi tipo) {
        super(processore, ram, memoriaMassa, marca, modello, SO);
        this.contenitore = contenitore;
        this.schedaVideo = schedaVideo;
        this.tipo = tipo;
    }

    // Getter e Setter
    public Contenitore getContenitore() {
        return contenitore;
    }

    public void setContenitore(Contenitore contenitore) {
        this.contenitore = contenitore;
    }

    public String getSchedaVideo() {
        return schedaVideo;
    }

    public void setSchedaVideo(String schedaVideo) {
        this.schedaVideo = schedaVideo;
    }

    public tipi getTipo() {
        return tipo;
    }

    // Metodo toString
    @Override
    public String toString() {
        return super.toString() + String.format("Tipo: %s, computer.Contenitore: %s, Scheda Video: %s", tipo, contenitore, schedaVideo);
    }

    // Metodo equals
    @Override
    public boolean equals(Object o) {
        if(!(o instanceof PCfissi computer)){
            return false;
        }else{
            return super.equals(computer) && schedaVideo.equals(computer.schedaVideo) && tipo.equals(computer.tipo) && contenitore.equals(computer.contenitore);
        }
    }
}