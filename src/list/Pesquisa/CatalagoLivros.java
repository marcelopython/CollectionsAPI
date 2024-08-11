package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalagoLivros {

    private List<Livro> livroList = new ArrayList<>();

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {

        livroList.add(new Livro(titulo, autor, anoPublicacao));

    }

    public List<Livro> pesquisarPorAutor(String autor) {

        if(livroList.isEmpty()){
            return this.livroList;
        }

        List<Livro> livrosPorAutor = new ArrayList<>();

        for (Livro livro : this.livroList) {
            if (livro.getAutor().equalsIgnoreCase(autor)) {
                livrosPorAutor.add(livro);
            }
        }

        return livrosPorAutor;
    }

    public List<Livro> pesquisaPorIntervaloAnos(int anoInicial, int anoFinal) {

        if (livroList.isEmpty()) {
            return this.livroList;
        }

        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();

        for (Livro livro : this.livroList) {

            if (livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal) {
                livrosPorIntervaloAnos.add(livro);
            }

        }

        return livrosPorIntervaloAnos;

    }

    public Livro pesquisaPorTitulo(String titulo) {
        Livro livroPorTitulo = null;

        if (livroList.isEmpty()) {
            return livroPorTitulo;
        }

        for (Livro livro : this.livroList) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                livroPorTitulo = livro;
                break;
            }
        }

        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalagoLivros catalagoLivros = new CatalagoLivros();
        catalagoLivros.adicionarLivro("Livro 1", "Autor 1", 2020);
        catalagoLivros.adicionarLivro("Livro 1", "Autor 2", 2021);
        catalagoLivros.adicionarLivro("Livro 2", "Autor 2", 2022);
        catalagoLivros.adicionarLivro("Livro 3", "Autor 3", 2023);
        catalagoLivros.adicionarLivro("Livro 4", "Autor 4", 1994);

        System.out.println(catalagoLivros.pesquisarPorAutor("Autor 2"));
        System.out.println(catalagoLivros.pesquisaPorIntervaloAnos(2020, 2022));
        System.out.println(catalagoLivros.pesquisaPorTitulo("Livro 1"));

    }

}
