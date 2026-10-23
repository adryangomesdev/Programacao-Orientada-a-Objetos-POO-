package laboratorio_static;

public class Mesa extends Movel {
    private int tamanho;

    Mesa(String nome, int tamanho) {
        super(nome);
        this.tamanho = tamanho;
    }

    @Override 
    public String toString() {
        return "Mesa [Nome: " + getNome() + ", Tamanho: " + tamanho + " lugares]"; 
    }

    public int getTamanho() {
        return tamanho;
    }
}
