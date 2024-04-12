public class Main{

    public static void main(String[] args) {
        
        Carro carro_001 = new Carro("Fiat", "Uno Mille Economy", 2013, 19_000);

        // informações do carro 1
        carro_001.status();

        System.out.println();

        // informações do carro 2
        Carro carro_002 = new Carro("Volkswagen", "Gol", 2002, 12_500);

        carro_002.status();

        System.out.println();

        // informações do vendedor
        Vendedor vendedor_001 = new Vendedor("Luis Fernando", "Vendas", "Vendedor", 1_800);

        vendedor_001.status();

    }

}