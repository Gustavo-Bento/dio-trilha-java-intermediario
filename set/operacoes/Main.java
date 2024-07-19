package set.operacoes;

public class Main {
    public static void main(String[] args) {
        Convidados c = new Convidados();
        System.out.println("Total: "+c.contarConvidado());

        c.adicionarConvidado("Gustavo", 2024001);
        c.adicionarConvidado("Murilo", 2024002);
        c.adicionarConvidado("Caique", 2024003);
        c.adicionarConvidado("Beatriz", 2024004);
        System.out.println("Total: "+c.contarConvidado());
        c.exibirConvidado();

        c.removerConvidado(2024001);
        System.out.println("Total: "+c.contarConvidado());
        c.adicionarConvidado("Roseli", 2024);
        c.adicionarConvidado("Beatriz", 2024004);
        c.exibirConvidado();
    }
}
