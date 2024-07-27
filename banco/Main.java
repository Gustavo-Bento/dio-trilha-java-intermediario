package banco;

public class Main {
    public static void main(String[] args) {
        Conta cc = new ContaCorrente();
        Conta cp = new ContaPoupanca(); 

        cc.depositar(200);
        cp.depositar(120);

        cc.transferir(50, cp);
        
        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
