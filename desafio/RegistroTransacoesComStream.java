package desafio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RegistroTransacoesComStream {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldo = scanner.nextDouble();

        int quantidadeTransacoes = scanner.nextInt();

        List<Transacao> transacoes = new ArrayList<>();

        for (int i = 1; i <= quantidadeTransacoes; i++) {
            char tipoTransacao = scanner.next().charAt(0);
            double valorTransacao = scanner.nextDouble();

            Transacao transacao = new Transacao(tipoTransacao, valorTransacao);
            transacoes.add(transacao);

            // Verifica e atualiza o saldo da conta com base no tipo de transação
            if (tipoTransacao == 'd') {
                saldo += valorTransacao;
            } else if (tipoTransacao == 's') {
                saldo -= valorTransacao;
            } 
        }

        // Exibir o saldo final
        System.out.println("Saldo : " + saldo);

        // Exibir a lista de transações usando Streams
        System.out.println("Transacoes:");
        transacoes.stream()
                .map(Transacao::toString)
                .forEach(System.out::println);

        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}
