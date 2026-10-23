package laboratorio_static;

public class Cadeira extends Movel {
    private boolean comBraco;

    Cadeira(String nome, boolean comBraco) {
        super(nome);
        this.comBraco = comBraco;
    }

    @Override
    public String toString() {  
        return "Cadeira [Nome: " + getNome() + ", Com braço: " + (comBraco ? "Sim" : "Não") + "]";
    }

    public boolean isComBraco() {
        return comBraco;
    }
    
}
