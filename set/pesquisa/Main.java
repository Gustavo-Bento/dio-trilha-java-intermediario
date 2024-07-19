package set.pesquisa;

public class Main {
    public static void main(String[] args) {
        Agenda a = new Agenda();
        a.exibirContato();
        a.adicionarContato("Gustavo Casa", 12123281);
        a.adicionarContato("Luana", 12312949);
        a.adicionarContato("Gustavo Trabalho", 12122281);
        a.adicionarContato("Natalia", 21931231);
        a.adicionarContato("Luana", 12312949);
        a.adicionarContato("Riquelme", 97960559);
        a.exibirContato();
        System.out.println(a.pesquisarNome("Gustavo"));
        System.out.println(a.atualizarNumero("Natalia", 40028922));
        System.out.println(a.pesquisarNome("Nataliaz"));
    }
}
