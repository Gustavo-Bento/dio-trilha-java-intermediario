package map.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
        estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade));
    }

    public void exibirProduto() {
        System.out.printf("%-10s %-20s %-10s %-10s%n", "Código", "Nome", "Quantidade", "Preço");
        System.out.println("--------------------------------------------------------------");
        for (Map.Entry<Long, Produto> dado : estoqueProdutosMap.entrySet()) {
            Long c = dado.getKey();
            Produto p = dado.getValue();
            System.out.printf("%-10d %-20s %-10d %-10.2f%n", c, p.getNome(), p.getQuantidade(), p.getPreco());
        }
    }

    public double valorTotal() {
        double valorTotal = 0d;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                valorTotal += p.getPreco() * p.getQuantidade();
            }
        }
        return valorTotal;
    }

    public String produtoMaisCaro() {
        Produto res = null;
        long cod = 0;
        double maiorPreco = Double.MIN_VALUE;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Map.Entry<Long, Produto> dado : estoqueProdutosMap.entrySet()) {
                if (dado.getValue().getPreco() > maiorPreco) {
                    maiorPreco = dado.getValue().getPreco();
                    res = dado.getValue();
                    cod = dado.getKey();
                }
            }
        }
        if (res != null) {
            return cod+"    "+res.getNome() +"    "+ res.getQuantidade() +"    "+ res.getPreco();
        } else {
            return "Nenhum produto encontrado.";
        }
    }

    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();

        estoque.adicionarProduto(1, "Papel A4", 1200, 0.03);
        estoque.adicionarProduto(2, "Caneta", 1500, 0.50);
        estoque.adicionarProduto(3, "Lápis", 1000, 0.25);
        estoque.adicionarProduto(4, "Borracha", 800, 0.20);
        estoque.adicionarProduto(5, "Caderno", 500, 2.50);
        estoque.adicionarProduto(6, "Marcador", 300, 1.20);
        estoque.adicionarProduto(7, "Grampeador", 100, 5.00);
        estoque.adicionarProduto(8, "Perfurador", 70, 6.50);
        estoque.adicionarProduto(9, "Tesoura", 200, 2.75);
        estoque.adicionarProduto(10, "Régua", 350, 1.00);
        estoque.adicionarProduto(11, "Apontador", 600, 0.60);
        estoque.adicionarProduto(12, "Cola", 400, 1.30);
        estoque.adicionarProduto(13, "Pasta", 250, 3.00);
        estoque.adicionarProduto(14, "Agenda", 150, 4.50);
        estoque.adicionarProduto(15, "Calculadora", 50, 15.00);
        estoque.adicionarProduto(16, "Clips", 1000, 0.05);
        estoque.adicionarProduto(17, "Fita adesiva", 450, 1.10);
        estoque.adicionarProduto(18, "Bloco de notas", 700, 0.80);
        estoque.adicionarProduto(19, "Envelope", 1200, 0.10);
        estoque.adicionarProduto(20, "Lápis de cor", 300, 3.50);
        estoque.adicionarProduto(21, "Caneta marca-texto", 250, 1.50);
        estoque.adicionarProduto(22, "Estilete", 80, 2.00);
        estoque.adicionarProduto(23, "Durex", 500, 0.90);
        estoque.adicionarProduto(24, "Corretivo", 350, 1.80);
        estoque.adicionarProduto(25, "Pincel", 200, 2.25);

        estoque.exibirProduto();
        System.out.println("");
        System.out.println("Total do estoque: R$ "+estoque.valorTotal());
        System.out.println("");
        System.out.println("Produto mais caro: "+estoque.produtoMaisCaro());
    }
}
