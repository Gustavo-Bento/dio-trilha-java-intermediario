package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    public static void main(String[] args) {
        List<Integer>numeros = Arrays.asList(1,2,3,4,5);

        int resultado = numeros.stream().reduce(0, new BinaryOperator<Integer> (){
            public Integer apply(Integer n1, Integer n2){
                return n1+n2;
            }
        });

        System.out.println("A soma dos dois numeros é: "+resultado);
    }
}
