package map.OpacaoBasica;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    private Map<String, Integer> agendaContatoMap = new HashMap<>();

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String  nome) {
        if(!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos() {
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if(!agendaContatoMap.isEmpty()){
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {

        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Camila", 123432);
        agendaContatos.adicionarContato("Camila", 567);
        agendaContatos.adicionarContato("Camila Cavalcante", 563237);
        agendaContatos.adicionarContato("Camila DIO", 4563237);
        agendaContatos.adicionarContato("Maria silva", 111111);
        agendaContatos.adicionarContato("Camila", 66666);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Maria silva");
        agendaContatos.exibirContatos();

        System.out.println("O numero e: "+ agendaContatos.pesquisarPorNome("Camila DIO"));

    }

}
