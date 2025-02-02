import computer.*;

public class Main {
    public static void main(String[] args) {

        // Creazione di un nuovo oggetto Server
        Server server = new Server("AMD EPYC", 128, 5000, "HP", "ProLiant", "Windows Server", 4, true, tipi.Server);
        System.out.println(server);

        // Creazione di un oggetto computer.Portatili
        Portatili notebook = new Portatili("i7", 16, 512, "Asus", "ZenBook", "Linux", 3, 13, 50, 30, 20, tipi.Notebook);
        System.out.println(notebook);

        // Creazione di un oggetto computer.PCfissi
        PCfissi desktop = new PCfissi("Ryzen 9", 32, 1000, "Acer", "Predator", "Windows", Contenitore.grande, "NVIDIA RTX 3080", tipi.PC);
        System.out.println(desktop);

        // Up-casting
        Computer computer1 = new Server("AMD EPYC", 64, 3000, "Supermicro", "X10", "Ubuntu", 8, false, tipi.Server);
        System.out.println(computer1);

        // Down-casting
        if (computer1 instanceof Server) {
            Server server2 = (Server) computer1;
            System.out.println("Down-casting riuscito: " + server2.getnProcessori());
        }
    }
}
