package list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {

    private List<Pessoa> pessoaList = new ArrayList<>();

    public void adicionarPessoa(String nome, int idade, double altura) {
        this.pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordernarPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(this.pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordernarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(this.pessoaList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoas orderOrdenacaoPessoas = new OrdenacaoPessoas();
        orderOrdenacaoPessoas.adicionarPessoa("Nome 1", 20, 1.56);
        orderOrdenacaoPessoas.adicionarPessoa("Nome 2", 30, 1.80);
        orderOrdenacaoPessoas.adicionarPessoa("Nome 3", 25, 1.70);
        orderOrdenacaoPessoas.adicionarPessoa("Nome 4", 17, 1.56);

        System.out.println(orderOrdenacaoPessoas.ordernarPorIdade());
        System.out.println(orderOrdenacaoPessoas.ordernarPorAltura());

    }

}
