package operacoes;

import java.util.ArrayList;
import java.util.List;

public class ListarTarefa {
    private List<Tarefa> tarefaLista;

    public ListarTarefa() {
        this.tarefaLista = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaLista.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefasRemover = new ArrayList<>();
        for(Tarefa t: tarefaLista){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasRemover.add(t);
            }
        }
        tarefaLista.removeAll(tarefasRemover);
    }

    public int totalTarefas(){
        return tarefaLista.size();
    }

    public void descricaoTarefa(){
        System.out.println(tarefaLista);
    }

    public static void main(String[] args) {
        ListarTarefa l1 = new ListarTarefa();

        l1.adicionarTarefa("Tarefa 1");
        l1.adicionarTarefa("Tarefa 2");
        l1.descricaoTarefa();
        System.out.printf("Total de tarefas: %d\n",l1.totalTarefas());
        l1.adicionarTarefa("Tarefa 1");
        System.out.printf("Total de tarefas: %d\n",l1.totalTarefas());
        l1.removerTarefa("Tarefa 1");
        System.out.printf("Total de tarefas: %d\n",l1.totalTarefas());

    }
}
