package list.ordenacoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdernarPessoa {
    private List<Pessoa> pessoaList;

    public OrdernarPessoa() {
        this.pessoaList = new ArrayList<>();
    }

    public List<Pessoa> getPessoaList() {
        return pessoaList;
    }    

    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordernarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }
    
    public List<Pessoa> ordernarPorAlura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }

}
