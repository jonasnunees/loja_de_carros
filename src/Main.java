public class Main{

    public static void main(String[] args) {
        
        Carro carro_001 = new Carro("Fiat", "Uno Mille Economy", 2013, 19_000);

        // informações do carro 1
        System.out.println("Marca: " + carro_001.getMarca());
        System.out.println("Modelo: " + carro_001.getModelo());
        System.out.println("Ano: " + carro_001.getAno());
        System.out.println("Valor de venda: R$ " + carro_001.getValorVenda());

        System.out.println();

        // informações do carro 2
        Carro carro_002 = new Carro("Volkswagen", "Gol", 2002, 12_500);

        System.out.println("Marca: " + carro_002.getMarca());
        System.out.println("Modelo: " + carro_002.getModelo());
        System.out.println("Ano: " + carro_002.getAno());
        System.out.println("Valor de venda: R$ " + carro_002.getValorVenda());

    }

}