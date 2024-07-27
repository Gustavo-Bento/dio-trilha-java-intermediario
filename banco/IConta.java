package banco;

public interface IConta {
    void transferir(double valor);

    void sacar(double valor);
    
    void depositar(double valor, Conta contaDestino);
}
