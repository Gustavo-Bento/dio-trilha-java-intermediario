package stream;

import java.util.List;
import java.util.stream.Stream;

public class SupplierExemple {
    public static void main(String[] args) {

        List<String> listaSaudacoes = Stream.generate( () -> "Hello world")
                .limit(5)
                .toList();

        listaSaudacoes.forEach(System.out::println);
    }
}