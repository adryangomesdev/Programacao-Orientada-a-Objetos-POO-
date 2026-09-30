public class Personagem {
    private int idade;
    private IEstadoPersonagem estado;

    public Personagem(int idade) {
        this.idade = idade;

        if (idade <= 15) {
            this.estado = new Crianca();
        }
        else if (idade > 15 && idade < 30) {
            this.estado = new Jovem();
        }
        else if (idade >= 30) {
            this.estado = new Adulto();
        }

    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
        
        if (idade <= 15) {
            if (!(this.estado instanceof Crianca)) {
                this.estado = new Crianca();
            }
        }

        else if (idade > 15 && idade < 30) {
            if (!(this.estado instanceof Jovem)) {
                this.estado = new Jovem();
            }
        }

        else if (idade >= 30) {
            if (!(this.estado instanceof Adulto)) {
                this.estado = new Adulto();
            }
        }
    }
    
    public void andar() {
        if (this.estado != null) {
            this.estado.andar(this);
        }
    }
}