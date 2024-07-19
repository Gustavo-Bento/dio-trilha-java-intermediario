package list.ordenacoes;

public class Main {
    public static void main(String[] args) {
        OrdernarPessoa o = new OrdernarPessoa();
        o.adicionarPessoa("Gustavo",20,1.70);
        o.adicionarPessoa("Matheus", 19, 1.73);
        o.adicionarPessoa("Caio", 24, 1.69);
        o.adicionarPessoa("Murilo", 31, 1.74);

        System.out.println(o.getPessoaList());
        System.out.println(o.ordernarPorIdade());
        System.out.println(o.ordernarPorAlura());
    }
}
