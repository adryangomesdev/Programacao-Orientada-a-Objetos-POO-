public class Crianca implements  IEstadoPersonagem{
    public Crianca() {
        super();
    }

    @Override 
    public void andar(Personagem p) {
        System.out.println("A criança de " + p.getIdade() + " anos de idade está andando.");
    }
}
