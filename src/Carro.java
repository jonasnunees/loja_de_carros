public class Carro {
    
    private String marca;
    private String modelo;
    private int ano;
    private double valor;

    // método construtor
    Carro(String marca, String modelo, int ano, double valor){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.valor = valor;
    }

    // métodos getters
    public String getMarca(){
        return marca;
    }

    public String getModelo(){
        return modelo;
    }

    public int getAno(){
        return ano;
    }

    public double getValor(){
        return valor;
    }

    // métodos setters
    public void setMarca(String marca){
        this.marca = marca;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public void setAno(int ano){
        this.ano = ano;
    }

    public void setValor(double valor){
        this.valor = valor;
    }

    // método para definir o valor de venda do veículo
    public double getValorVenda(){
        return valor += valor * 30 / 100;
    }

}
