package Exercicio1;

public class Cliente extends Pessoa {
    private float valorDivida;

    public Cliente() {
    }

    public Cliente(float valorDivida, String nome, String fone) {
        super(nome, fone);
        this.valorDivida = valorDivida;
    }
    
    public float CalculaJuros(float taxa){
        return valorDivida * taxa;
    }

    public float getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(float valorDivida) {
        this.valorDivida = valorDivida;
    }

    @Override
    public String toString() {
        return "Cliente{" + "Nome: " + getNome() + "Telefone: " + getFone() + "valorDivida=" + valorDivida + '}';
    }
}
