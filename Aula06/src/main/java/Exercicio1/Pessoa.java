package Exercicio1;

public class Pessoa {
    private String nome, fone;

    public Pessoa() {
    }

    public Pessoa(String nome, String fone) {
        this.nome = nome;
        this.fone = fone;
    }

    public String getNome() {
        return nome;
    }

    public String getFone() {
        return fone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", fone=" + fone + '}';
    }
}
