public class PrincipalPersonagem {
    public void main() {
        Personagem manoel = new Personagem(7);
        manoel.andar();
        
        manoel.setIdade(18);
        manoel.andar();
        
        manoel.setIdade(33);
        manoel.andar();
        
        manoel.setIdade(12);
        manoel.andar();

    }
}

//c) Análise do Comportamento do Programa

// 1. O comportamento do método andar() mudou dinamicamente. Conforme a idade foi alterada, o objeto associado ao atributo de estado foi atualizado, fazendo com que o personagem imprimisse mensagens diferentes (Criança, Jovem ou Adulto).

// 2. O personagem delegou o comportamento de caminhar para a sua classe de estado correspondente por meio de agregação, atualizando internamente qual regra de negócio deveria ser executada ao caminhar.

// 3. O recurso principal utilizado foi o polimorfismo de inclusão (junto com o padrão de projeto State / composição/agregação), permitindo que a classe Personagem invoque o método andar() de forma polimórfica dependendo da instância concreta de EstadoPersonagem atribuída a ele.