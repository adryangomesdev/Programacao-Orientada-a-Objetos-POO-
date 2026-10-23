package laboratorio_static;

public abstract class Movel {
    private String nome;

    Movel(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Movel: " + nome;
    }

    public String getNome() {
        return nome;
    }
}
