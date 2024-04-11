public class Funcionario {

    private String nome;
    private String setor;
    private String cargo;
    private double salario;

    // método construtor
    Funcionario(String nome, String setor, String cargo, double salario){
        this.nome = nome;
        this.setor = setor;
        this.cargo = cargo;
        this.salario = salario;
    }

    // métodos getters
    public String getNome(){
        return nome;
    }

    public String getSetor(){
        return setor;
    }

    public String getCargo(){
        return cargo;
    }

    public double getSalario(){
        return salario;
    }

    // métodos setters
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setSetor(String setor){
        this.setor = setor;
    }

    public void setCargo(String cargo){
        this.cargo = cargo;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }
    
}
