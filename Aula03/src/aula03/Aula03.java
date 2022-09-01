package aula03;

public class Aula03 {

    public static void main(String[] args) {
        /*
        Produto p1 = new Produto();
        
        p1.setMarca("PACE");
        
        System.out.println(p1.marca);
        
        Produto p2 = new Produto("Mouse", "Redragon", "01001011", 200);
        
        System.out.println(p2.marca);
        
        System.out.println(p1.numero());
        
        p1.dobro(4);
        System.out.println(p1.soma(5, 10));
        */
        
        Conta_Poupanca cp = new Conta_Poupanca("380", "1001", 1000, 5);
        
        cp.imprineDados();
        System.out.println(cp.calculaRendimento());
        cp.depositar(100);
        cp.imprineDados();
    }
    
}
