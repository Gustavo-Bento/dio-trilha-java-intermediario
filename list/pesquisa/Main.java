package list.pesquisa;

public class Main {
    public static void main(String[] args) {
        CatalogoLivro c = new CatalogoLivro();
        c.adicionarLivro("Pascal", "Bianch", 1986);
        c.adicionarLivro("Cobol", "Bianch", 1977);
        c.adicionarLivro("Python", "Piva", 2009);
        c.adicionarLivro("Java", "Glauco", 2011);
        c.adicionarLivro("Java", "Piva", 2008);
        c.adicionarLivro("SGBD", "WaltDiney", 2020);

        System.out.println(c.pesquisarAutor("Piva"));
        System.out.println(c.intervaloAnos(1900,2010));
        System.out.println(c.pesquisarTitulo("Java"));
    }
}
