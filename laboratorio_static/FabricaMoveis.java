package laboratorio_static;

public class FabricaMoveis {
    private static int numCadeiras = 0;
    private static int numMesas = 0;
    private static int numEstantes = 0;
    private static int numSofas = 0;

    private FabricaMoveis() {    
    }

    public static Cadeira fazerCadeira(String nome, boolean comBraco) {
        numCadeiras++;
        return new Cadeira(nome, comBraco);
    }

    public static Mesa fazerMesa(String nome, int tamanho) {
        numMesas++;
        return new Mesa(nome, tamanho);
    }
    
    public static Estante fazerEstante(String nome, int numPrateleiras) {
        numEstantes++;
        return new Estante(nome, numPrateleiras);
    }

    public static Sofa fazerSofa(String nome, int numLugares) {
        numSofas++;
        return new Sofa(nome, numLugares);
    }

    public static int getNumCadeiras() {
        return numCadeiras;
    }

    public static int getNumMesas() {
        return numMesas;
    }

    public static int getNumEstantes() {
        return numEstantes;
    }

    public static int getNumSofas() {
        return numSofas;
    }

    public static int getTotalMoveis() {
        return numCadeiras + numEstantes + numMesas + numSofas;
    }
}
