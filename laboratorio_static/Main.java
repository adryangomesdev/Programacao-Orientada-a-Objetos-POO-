package laboratorio_static;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Iniciando a Fábrica de Móveis ---");

        Cadeira c1 = FabricaMoveis.fazerCadeira("Cadeira Gamer", true);
        Cadeira c2 = FabricaMoveis.fazerCadeira("Cadeira de Jantar", false);
        
        Mesa m1 = FabricaMoveis.fazerMesa("Mesa de Jantar", 6);
        Mesa m2 = FabricaMoveis.fazerMesa("Mesa de Escritório", 2);
        
        Estante e1 = FabricaMoveis.fazerEstante("Estante de Livros", 5);
        
        Sofa s1 = FabricaMoveis.fazerSofa("Sofá de Canto", 4);

        System.out.println("\n--- Móveis Criados ---");
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(m1.toString());
        System.out.println(m2.toString());
        System.out.println(e1.toString());
        System.out.println(s1.toString());

        System.out.println("\n--- Relatório de Produção ---");
        System.out.println("Total de Cadeiras: " + FabricaMoveis.getNumCadeiras());
        System.out.println("Total de Mesas: " + FabricaMoveis.getNumMesas());
        System.out.println("Total de Estantes: " + FabricaMoveis.getNumEstantes());
        System.out.println("Total de Sofás: " + FabricaMoveis.getNumSofas());
        
        System.out.println("Quantidade total de móveis criados: " + FabricaMoveis.getTotalMoveis());
    }
}
