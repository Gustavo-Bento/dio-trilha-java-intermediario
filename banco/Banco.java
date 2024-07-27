package banco;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Banco{
    private String nome;
    private List<Conta> contas;
    private List<Cliente> clientes = new ArrayList<>();

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public List<Conta> getContas() {
        return contas;
    }
    public void setContas(List<Conta> contas) {
        this.contas = contas;
    } 
    
    public List<String> listarClientes() {
        return clientes.stream()
                .map(Cliente::getNome)
                .distinct()
                .collect(Collectors.toList());
    }
}
