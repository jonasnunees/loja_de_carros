public class Vendedor extends Funcionario {

    public Vendedor(String __nome, String __setor, String __cargo, double __salario){
        super(__nome, __setor, __cargo, __salario);
    }

    public void status(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("Setor: " + this.getSetor());
        System.out.println("Cargo: " + this.getCargo());
    }
    
}
