package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    private Set<Contato> contatoSet = new HashSet<>();

    public void adicionarContato(String nome, int numero) {
        this.contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContato() {
        System.out.println(this.contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome) {

        Set<Contato> contatosPorNome = new HashSet<>();

        for (Contato contato : this.contatoSet) {

            if(contato.getNome().startsWith(nome)) {
                contatosPorNome.add(contato);
            }

        }

        return contatosPorNome;

    }


    public Contato atualizarNumeroContato(String nome, int numero) {
        Contato contatoAtualizado = null;

        for (Contato contato : this.contatoSet) {
            if(contato.getNome().equalsIgnoreCase(nome)) {
                contato.setNumero(numero);
                contatoAtualizado = contato;
                break;
            }
        }

        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContato();

        agendaContatos.adicionarContato("Camila", 12345);
        agendaContatos.adicionarContato("Camila", 0);
        agendaContatos.adicionarContato("Camila Cavalcante", 1211111);
        agendaContatos.adicionarContato("Camila DIO", 54656765);
        agendaContatos.adicionarContato("Maria Silva", 222222);

        agendaContatos.exibirContato();

        System.out.println(agendaContatos.pesquisarPorNome("Camila"));

        System.out.println("Contato atualizado: "+ agendaContatos.atualizarNumeroContato("Maria silva", 98765));
        agendaContatos.exibirContato();

    }

}
