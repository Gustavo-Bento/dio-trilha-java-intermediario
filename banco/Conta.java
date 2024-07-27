package banco;

public abstract class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    private int agencia;
    private int conta;
    private double saldo = 0d;

    public Conta() {
        this.agencia = AGENCIA_PADRAO;
        this.conta = SEQUENCIAL++;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public int getAgencia() {
        return agencia;
    }

    public int getConta() {
        return conta;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void imprimirInfoConta(){
        System.out.println(String.format("Agencia: %d",this.getAgencia()));
        System.out.println(String.format("Conta: %d",this.getConta()));
        System.out.println(String.format("Saldo: %.2f\n",this.getSaldo()));
    
    }
}
