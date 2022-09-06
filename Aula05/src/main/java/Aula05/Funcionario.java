package Aula05;

public class Funcionario {
    private int cracha;
    private float salario;
    private String cargo;

    public Funcionario() {
    }

    public Funcionario(int cracha, float salario, String cargo) {
        this.cracha = cracha;
        this.salario = salario;
        this.cargo = cargo;
    }

    public int getCracha() {
        return cracha;
    }

    public float getSalario() {
        return salario;
    }

    public String getCargo() {
        return cargo;
    }
    
    public void calculaAumento(float porcentagem){
        salario = salario + (salario * porcentagem / 100);
        System.out.println("O novo salário é: " + salario);
    }
    
    public void aumentaSalario(int tempo){
        salario = salario + (tempo * 150);
        System.out.println("O novo salário é: " + salario);
    }
}
