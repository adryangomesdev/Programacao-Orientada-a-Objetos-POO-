package laboratorio_static;

public class Sofa extends Movel {
    private int numLugares;
    
    Sofa(String nome,int numLugares) {
        super(nome);
        this.numLugares = numLugares;
    }

    public String toString() {
        return "Sofá [Nome: " + getNome() + ", Lugares: " + numLugares + "]";
    }

    public int getNumLugares() {
        return numLugares;
    }
}
