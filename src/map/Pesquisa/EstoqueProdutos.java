package map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    private Map<Long, Produto> estoqueProdutosMap = new HashMap<>();

    public void adicionarProduction(long code, String nome, int quantidade, double preco) {
        estoqueProdutosMap.put(code, new Produto(nome, preco, quantidade));
    }

    public void exibirProduto() {
        System.out.println(estoqueProdutosMap);
    }

    public double calculaValorTotalEstoque() {
        if(this.estoqueProdutosMap.isEmpty()) {
            return 0d;
        }

        double valorTotal = 0d;

        for (Produto produto : this.estoqueProdutosMap.values()) {
            valorTotal += produto.getQuantidade() * produto.getPreco();
        }

        return valorTotal;
    }

    public Produto obterProdutoMaisCaro() {

        Produto produtoMaisCaro = null;

        if(this.estoqueProdutosMap.isEmpty()) {
            return produtoMaisCaro;
        }

        double maiorPreco = Double.MIN_VALUE;

        for (Produto produto : this.estoqueProdutosMap.values()) {
            if(produto.getPreco() > maiorPreco) {
                produtoMaisCaro = produto;
            }
        }

        return produtoMaisCaro;
    }

    public static void main(String[] args) {

        EstoqueProdutos estoque = new EstoqueProdutos();

        estoque.exibirProduto();

        estoque.adicionarProduction(1L, "Produto a", 10, 5.0);
        estoque.adicionarProduction(2L, "Produto b", 5, 10.0);
        estoque.adicionarProduction(3L, "Produto c", 2, 15.0);

        estoque.exibirProduto();

        System.out.println("Valor total de estoque: R$ " + estoque.calculaValorTotalEstoque());
        System.out.println("Produto mais caro: " + estoque.obterProdutoMaisCaro());

    }


}
