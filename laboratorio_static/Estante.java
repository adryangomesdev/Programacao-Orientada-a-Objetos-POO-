package laboratorio_static;

public class Estante extends Movel {
    private int numPrateleiras;

    Estante(String nome, int numPrateleiras) {
        super(nome);
        this.numPrateleiras = numPrateleiras;
    }
    
    @Override 
    public String toString() {
        return "Estante [Nome: " + getNome() + ", Prateleiras: " + numPrateleiras + "]";
    }

    public int getNumPrateleira() {
        return numPrateleiras;
    }
}
