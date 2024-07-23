package stream;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SupplierExemple{
    public static void main(String[] args) {
        Supplier<String> saudacao = ()-> "Hello world!";

        List<String> listaSaudacoes = Stream.generate(saudacao).limit(5).collect(Collectors.toList());

        listaSaudacoes.forEach(s->System.out.println(s));
    }
}