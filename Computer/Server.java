package computer;

public class Server extends Computer {

    // Attributi
    private int nProcessori;
    private boolean raid;
    private tipi tipo;

    // Costruttore
    public Server(String processore, int ram, int memoriaMassa, String marca,String modello, String SO, int nProcessori, boolean raid, tipi tipo) {
        super(processore, ram, memoriaMassa, marca, modello, SO);
        this.nProcessori = nProcessori;
        this.raid = raid;
        this.tipo = tipo;
    }

    // Getter e Setter
    public int getnProcessori() {
        return nProcessori;
    }

    public void setnProcessori(int nProcessori) {
        this.nProcessori = nProcessori;
    }

    public boolean isRaid() {
        return raid;
    }

    public void setRaid(boolean raid) {
        this.raid = raid;
    }

    public void setTipo(tipi tipo) {
        this.tipo = tipo;
    }

    public tipi getTipo() {
        return tipo;
    }

    // Metodo toString
    @Override
    public String toString() {
        return super.toString() + String.format(" , Tipo: %s, nProcessori: %d, Sono presenti Raid: %s", tipo, nProcessori, raid);
    }

    // Metodo equals
    @Override
    public boolean equals(Object o) {
        if(!(o instanceof Server computer)){
            return false;
        }else{
            return super.equals(computer) && tipo.equals(computer.tipo) && nProcessori == computer.nProcessori;
        }
    }
}