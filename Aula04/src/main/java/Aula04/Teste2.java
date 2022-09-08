package Aula04;

import java.util.ArrayList;

public class Teste2 {
    public static void main(String[] args) throws Exception{
        ArrayList<String> arrayList = new ArrayList<String>();
        
        arrayList.add("Elemento A");
        arrayList.add("Elemento B");
        
        System.out.println(arrayList);
        
        arrayList.add(1, "Elemento B");
        
        System.out.println(arrayList);
    }
}
