package set.operacoes;

import java.util.HashSet;
import java.util.Set;

public class Convidados {
    private Set<Convidado> convidadoSet;

    public Convidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidado(int codigoConvite){
        Convidado convidadoRemovido = null;
        for(Convidado c: convidadoSet){
            if(c.getCodigoConvite() == codigoConvite){
                convidadoRemovido = c;
                break;
            }
        }
        convidadoSet.remove(convidadoRemovido);
    }

    public int contarConvidado(){
        return convidadoSet.size();
    }

    public void exibirConvidado(){
        System.out.println(convidadoSet);
    }
}
