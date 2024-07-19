package set.ordenacoes;

public class Main {
    public static void main(String[] args) {
        CadastroProdutos p = new CadastroProdutos();
        p.adicionarProduto(1, "Ovo", 12, 20);
        p.adicionarProduto(2, "Coxa", 17.38, 40);
        p.adicionarProduto(3, "Detergente", 3.7, 40);
        p.adicionarProduto(4, "Arroz", 5.89, 30);
        p.adicionarProduto(5, "Feijão", 6.45, 25);
        p.adicionarProduto(6, "Macarrão", 2.99, 50);
        p.adicionarProduto(7, "Leite", 4.29, 35);
        p.adicionarProduto(8, "Açúcar", 3.10, 45);
        p.adicionarProduto(9, "Café", 8.50, 20);
        System.out.println(p.getProdutoSet());
        System.out.println("\n");
        System.out.println(p.exibirNome());
        System.out.println("\n");
        System.out.println(p.exibirPreco());
    }
}
