package set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class Agenda {
    private Set<Contato> contatoSet;

    public Agenda() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContato(){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarNome(String nome){
        Set<Contato> contatosNome = new HashSet<>();
        for(Contato c: contatoSet){
            if(c.getNome().startsWith(nome)){
                contatosNome.add(c);
            }
        }
        return contatosNome;
    }

    public Contato atualizarNumero(String nome, int numero){
        Contato contatoAtualizado = null;
        for(Contato c: contatoSet){
            if(c.getNome().equals(nome)){
                c.setNumero(numero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }
}
