package Aula05;

public class Pessoa {
    private String nome;
    private int idade;
    private double renda;

    public Pessoa() {
    }

    public Pessoa(String nome, int idade, double renda) {
        this.nome = nome;
        this.idade = idade;
        this.renda = renda;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getRenda() {
        return renda;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + ", renda=" + renda + '}';
    }     
}
