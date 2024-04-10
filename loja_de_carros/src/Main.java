//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Carro carro_001 = new Carro("Fiat", "Uno Mille Economy", 2013, 19_000);

        System.out.println("Marca: " + carro_001.getMarca());
        System.out.println("Modelo: " + carro_001.getModelo());
        System.out.println("Ano: " + carro_001.getAno());
        System.out.println("Valor de venda: R$ " + carro_001.getValorVenda());

    }
}