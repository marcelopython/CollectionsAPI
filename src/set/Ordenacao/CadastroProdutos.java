package set.Ordenacao;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

    private Set<Produto> produtoSet = new HashSet<>();

    public void adicionarProduto(Long cod, String nome, double preco, int quantidade) {
        produtoSet.add(new Produto(nome, cod, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome () {
        Set<Produto> produtos = new TreeSet<>(this.produtoSet);
        return produtos;
    }

    public Set<Produto> exibirPorPreco() {
        Set<Produto> produtos = new TreeSet<>(new ComparatorPorPreco());
        produtos.addAll(produtoSet);
        return produtos;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();
        cadastroProdutos.adicionarProduto(1L, "Produto 5", 15d, 5);
        cadastroProdutos.adicionarProduto(2L, "Produto 9", 11d, 5);
        cadastroProdutos.adicionarProduto(1L, "Produto 3", 10d, 5);
        cadastroProdutos.adicionarProduto(9L, "Produto 1", 20d, 5);

        System.out.println(cadastroProdutos.produtoSet);

        System.out.println(cadastroProdutos.exibirProdutosPorNome());

        System.out.println(cadastroProdutos.exibirPorPreco());

    }

}
