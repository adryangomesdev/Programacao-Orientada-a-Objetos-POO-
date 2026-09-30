public class Jovem implements  IEstadoPersonagem {
    public Jovem() {
        super();
    }

    @Override 
    public void andar(Personagem p) {
        System.out.println("O jovem de " + p.getIdade() + " anos de idade está andando.");
    }
}
