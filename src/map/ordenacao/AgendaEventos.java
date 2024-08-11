package map.ordenacao;

import map.OpacaoBasica.Evento;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class AgendaEventos {


    private Map<LocalDate, Evento> eventosMap = new HashMap<>();

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        Evento evento = new Evento(nome, atracao);
        eventosMap.put(data, evento);
    }

    public void exibirAgenda() {
        Map<LocalDate, Evento> eventoMap = new TreeMap<>(eventosMap);
        System.out.println(eventoMap);
    }

    public void obterProximoEvento() {

        LocalDate dataAtual = LocalDate.now();
        Map<LocalDate, Evento> eventoTreeMap = new TreeMap<>(this.eventosMap);

        for(Map.Entry<LocalDate, Evento> entry : eventoTreeMap.entrySet()) {
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                System.out.println("O proximo evento: "+ entry.getValue() + " acontece na data "+ entry.getKey());
                break;
            }
        }



    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

//        Set<String> coresDaBandeiraDoBrasil = new TreeSet<>(Arrays.asList("verde", "amarelo", "azul", "branco"));
//
//        System.out.println(coresDaBandeiraDoBrasil);

        List<Character> consoantesMeuNome = Arrays.asList('c', 'm', 'l', 'c', 'v', 'l', 'c', 'n', 't');

//        Qual o resultado da chamada
        System.out.println(consoantesMeuNome);

//        agendaEventos.adicionarEvento(LocalDate.of(2022, Month.JULY, 15), "Evento 1", "Atracao 1");
//        agendaEventos.adicionarEvento(LocalDate.of(2022, Month.JULY, 10), "Evento 2", "Atracao 2");
//        agendaEventos.adicionarEvento(LocalDate.of(2022, Month.JULY, 5), "Evento 3", "Atracao 3");
//        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.SEPTEMBER, 10), "Evento 3", "Atracao 3");
//        agendaEventos.exibirAgenda();
//        agendaEventos.obterProximoEvento();
    }

}
