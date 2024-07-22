package map.ordenacoes;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;


public class AgendarEvento {
    private Map<LocalDate, Evento> eventoMap;

    public AgendarEvento() {
        this.eventoMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        // Evento evento = new Evento(nome, atracao);
        eventoMap.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda() {
        Map<LocalDate, Evento> eventoTreeMap = new TreeMap<>(eventoMap);
        System.out.printf("\n%-12s %-30s %-10s%n", "Data", "Nome", "Atração");
        System.out.println("----------------------------------------------------------------------------");
        for (Map.Entry<LocalDate, Evento> dado : eventoMap.entrySet()) {
            LocalDate d = dado.getKey();
            Evento e = dado.getValue();
            System.out.printf("%-12s %-30s %-10s%n", d, e.getNome(), e.getAtracao());
        }
    }

    public void obterProximoEvento() {
        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        Map<LocalDate, Evento> eventoTreeMap = new TreeMap<>(eventoMap);
        //System.out.println(dataAtual);
        for (Map.Entry<LocalDate, Evento> dado : eventoMap.entrySet()) {
            if (dado.getKey().isEqual(dataAtual) || dado.getKey().isAfter(dataAtual)) {
                proximaData = dado.getKey();
                proximoEvento = dado.getValue();
                System.out.printf("\n%-12s %-30s %-10s%n", "Data", "Nome", "Atração");
                System.out.println("-----------------------------------------------------------------------------");
                System.out.printf("%-12s %-30s %-10s%n", proximaData, proximoEvento.getNome(), proximoEvento.getAtracao());
                break;
            }
        }
    }

    public static void main(String[] args) {
        AgendarEvento ag = new AgendarEvento();

        ag.adicionarEvento(LocalDate.of(2024, 11, 11), "Aniversario da Bia", "Open Bar e Musica ao Vivo");
        ag.adicionarEvento(LocalDate.of(2024, 12, 25), "Natal em Familia", "Ceia e Troca de Presentes");
        ag.adicionarEvento(LocalDate.of(2025, 1, 1), "Ano Novo", "Festa de Réveillon");
        ag.adicionarEvento(LocalDate.of(2024, 10, 31), "Halloween", "Festa a Fantasia");
        ag.adicionarEvento(LocalDate.of(2024, 9, 7), "Independência do Brasil", "Desfile e Comemoração");
        ag.adicionarEvento(LocalDate.of(2024, 5, 12), "Dia das Mães", "Almoço Especial");
        ag.adicionarEvento(LocalDate.of(2024, 6, 12), "Dia dos Namorados", "Jantar Romântico");
        ag.adicionarEvento(LocalDate.of(2024, 8, 11), "Dia dos Pais", "Churrasco em Familia");
        ag.adicionarEvento(LocalDate.of(2024, 7, 22), "Amigo Secreto", "Reunião com Troca de Presentes");
        ag.adicionarEvento(LocalDate.of(2024, 3, 8), "Dia Internacional da Mulher", "Homenagem e Brunch");

        ag.exibirAgenda();

        ag.obterProximoEvento();
    }

}
