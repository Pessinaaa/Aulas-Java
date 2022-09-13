package Exercicio1;

import java.util.logging.Logger;

public class Fornecedor extends Pessoa {
    private float valorCompra;

    public Fornecedor() {
    }

    public Fornecedor(float valorCompra, String nome, String fone) {
        super(nome, fone);
        this.valorCompra = valorCompra;
    }

    public float getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(float valorCompra) {
        this.valorCompra = valorCompra;
    }

    @Override
    public String toString() {
        return "Fornecedor{" + "Nome: " + getNome() + "Telefone: " + getFone() + "valorCompra=" + valorCompra + '}';
    }
    
}
