package Aula04;

public class Teste {
    public static void main(String[] args){
        Vetor vetor = new Vetor(5);
        
        try{
            vetor.adiciona("elemento 1");
            vetor.adiciona("elemento 2");
        } catch(Exception e){
            e.printStackTrace();
        }
        
        System.out.println(vetor.tamanho());
        System.out.println(vetor.toString());
        
        try{
            System.out.println(vetor.busca(1));
            System.out.println(vetor.busca(2));
        } catch(Exception e){
            e.printStackTrace();
        }
        
        System.out.println(vetor.busca1("elemento 1"));
        
        try{
            System.out.println(vetor.adicionaInicio(0, "elemento 0"));
        } catch(Exception e){
            e.printStackTrace();
        }
        
        try{
            vetor.remove(1);
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}