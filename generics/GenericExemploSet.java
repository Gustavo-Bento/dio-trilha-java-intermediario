package generics;

import java.util.HashSet;
import java.util.Set;

public class GenericExemploSet {
    public static void main(String[] args) {
        Set conjuntoSemGenerics = new HashSet();
        conjuntoSemGenerics.add("Elemento 1");
        conjuntoSemGenerics.add("Elemento 2");

        Set<String> conjuntoComGenerics = new HashSet<>();
        conjuntoComGenerics.add("Elemento 1 Generics");
        conjuntoComGenerics.add("Elemento 2 Generics");

        for(String o: conjuntoComGenerics)
            System.out.println(o);

        for(Object o : conjuntoSemGenerics){
            String s = (String) o;
            System.out.println(s);
        }
    }
}
