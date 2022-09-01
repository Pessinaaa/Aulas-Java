package aula03;

import javax.swing.JOptionPane;

public class Conta_Poupanca {
    String agencia;
    String numero;
    float saldo;
    float taxa;

    public Conta_Poupanca() {
    }

    public Conta_Poupanca(String agencia, String numero, float saldo, float taxa) {
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
        this.taxa = taxa;
    }
    
    void imprineDados(){
        JOptionPane.showMessageDialog(null, "Dados da conta corrente" +
                "\nAgência: "+agencia +
                "\nNúmero: "+numero +
                "\nSaldo: "+saldo +
                "\nTaxa: "+taxa+"%");
    }
    
    void depositar(float valor){
        saldo = saldo + valor;
    }
    
    float calculaRendimento(){
        float rendimento;
        rendimento = saldo * taxa/100;
        return rendimento;
    }
}
