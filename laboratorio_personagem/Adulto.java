public class Adulto implements  IEstadoPersonagem {
    public Adulto() {
        super();
    }

    @Override 
    public void andar(Personagem p) {
        System.out.println("O adulto de " + p.getIdade() + " anos de idade está andando.");
    }
}
