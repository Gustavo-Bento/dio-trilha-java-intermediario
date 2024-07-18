package generics;

import java.util.ArrayList;
import java.util.List;

public class GenericExemploList {
    public static void main(String[] args) {
        List listaSemGenerics = new ArrayList();
        listaSemGenerics.add("Elemento 1");
        listaSemGenerics.add("Elemento 2");

        List<String> listaComGenerics =  new ArrayList();
        listaComGenerics.add("Elemento 1 Generics");
        listaComGenerics.add("Elemento 2 Generics");

        for(String o: listaComGenerics)
            System.out.println(o);

        for(Object o : listaSemGenerics){
            String s = (String) o;
            System.out.println(s);
        }
    }    
}
