package set.ordenacoes;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long codigo, String nome, double preco, int quantidade) {
        produtoSet.add(new Produto(codigo, nome, preco, quantidade));
    }

    public Set<Produto> exibirNome() {
        Set<Produto> produtosNome = new TreeSet<>(produtoSet);
        return produtosNome;
    }

    public Set<Produto> exibirPreco() {
        Set<Produto> produtosPreco = new TreeSet<>(new OrdernarPreco());
        produtosPreco.addAll(produtoSet);
        return produtosPreco;
    }

    public Set<Produto> getProdutoSet() {
        return produtoSet;
    }

}
