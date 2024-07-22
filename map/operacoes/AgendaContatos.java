package map.operacoes;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContato() {
        for (Map.Entry<String, Integer> dados : agendaContatoMap.entrySet()) {
            System.out.println("Nome: " + dados.getKey() + ", Número: " + dados.getValue());
        }
    }

    public Integer pesquisarContato(String nome) {
        Integer numeroTelefone = null;
        if (!agendaContatoMap.isEmpty()) {
            numeroTelefone = agendaContatoMap.get(nome);
        }
        return numeroTelefone;
    }

    public static void main(String[] args) {
        AgendaContatos ag = new AgendaContatos();
        ag.adicionarContato("Gustavo", 40251135);
        ag.adicionarContato("Maria", 40242449);
        ag.adicionarContato("Murilo", 40028922);
        ag.adicionarContato("Ana", 40448877);
        ag.adicionarContato("Carlos", 40253399);
        ag.adicionarContato("Fernanda", 40251100);
        ag.adicionarContato("João", 40240001);
        ag.adicionarContato("Luiza", 40020002);
        ag.adicionarContato("Ricardo", 40446655);
        ag.adicionarContato("Sofia", 40252233);
        ag.adicionarContato("Ana", 40448878);

        ag.exibirContato();

        ag.removerContato("Luiza");

        System.out.println("O número é: "+ag.pesquisarContato("Gustavo"));
    }
}
