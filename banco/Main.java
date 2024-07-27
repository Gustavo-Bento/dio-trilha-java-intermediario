package banco;

public class Main {
    public static void main(String[] args) {
        Cliente gustavo = new Cliente();
        gustavo.setNome("Gustavo");
        Banco itau = new Banco();

        Conta cc = new ContaCorrente(gustavo);
        Conta cp = new ContaPoupanca(gustavo); 

        cc.depositar(200);
        cp.depositar(120);

        cc.transferir(50, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();

        System.out.println(itau.listarClientes());
    }
}
