package set.OperacoesBasicas;

import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    private Set<Convidado> convidadoSet = new HashSet<>();

    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite) {

        Convidado convidadoParaRemover = null;

        for (Convidado convidado : this.convidadoSet) {
            if(convidado.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = convidado;
                break;
            }
        }

        this.convidadoSet.remove(convidadoParaRemover);

    }

    public int contarConvidados() {
        return this.convidadoSet.size();
    }

    public void exibirConvidados() {
        System.out.println(this.convidadoSet);
    }

    public static void main(String[] args) {

        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("Existe "+conjuntoConvidados.contarConvidados()+" dentro do set de convidados");

        conjuntoConvidados.adicionarConvidado("Convidado 1", 1234);
        conjuntoConvidados.adicionarConvidado("Convidado 2", 1235);
        conjuntoConvidados.adicionarConvidado("Convidado 3", 1235);
        conjuntoConvidados.adicionarConvidado("Convidado 4", 1236);

        System.out.println("Existe "+conjuntoConvidados.contarConvidados()+" dentro do set de convidados");

        conjuntoConvidados.removerConvidadoPorCodigoConvite(1234);

        System.out.println("Existe "+conjuntoConvidados.contarConvidados()+" dentro do set de convidados");

        conjuntoConvidados.exibirConvidados();

    }

}
