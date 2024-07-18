package generics;

import java.util.HashMap;
import java.util.Map;

public class GenericExemploMap {
    public static void main(String[] args) {
        Map mapaSemGenerics = new HashMap();
        mapaSemGenerics.put("Chave 1",10);
        mapaSemGenerics.put("Chave 2", 2);

        Map<String, Integer> mapaComGenerics = new HashMap<>();
        mapaComGenerics.put("Chave 1 Generics", 10);
        mapaComGenerics.put("Chave 2 Generics",2); 

        for(Map.Entry<String,Integer> entry: mapaComGenerics.entrySet()){
            String chave = entry.getKey();
            Integer valor = entry.getValue();
            System.out.printf("Chave: %s - valor: %s\n",chave,valor);
        }

        for(Object obj: mapaSemGenerics.entrySet()){
            Map.Entry entry = (Map.Entry) obj;
            String chave = (String) entry.getKey();
            Object valor = entry.getValue();
            System.out.printf("Chave: %s - valor:%s\n",chave,valor);
        }
    }
}
