import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    private List<String> tarefas = new ArrayList<>();

    public void adicionar(String newTarefa) {
        if(newTarefa == null){
            System.out.println("Tarefa esta vazia!");
        }
        tarefas.add(newTarefa);
        System.out.println("Tarefa adicionada!");
    }

    public void remover(int indice) {
        if(indice <= 0 || indice >= tarefas.size()){
            System.out.println("indice invalido: " + indice);
        }
        indice = indice -1;
        String tarefaRemovida = tarefas.remove(indice);
        System.out.println("Tarefa removida: " + tarefaRemovida);
    }

    public void listar() {
        if (tarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa na lista.");
            return;
        }
        System.out.println("\n=== LISTA DE TAREFAS ===");
        for (int i = 0; i < tarefas.size(); i++) {
            System.out.println((i + 1) + ". " + tarefas.get(i));
        }
    }

    public static void main(String[] args) {
        ListaTarefas lista = new ListaTarefas();
        
        lista.adicionar("Estudar Java");
        lista.adicionar("Fazer exercicios");
        lista.adicionar("Preparar apresentacao");
        
        lista.listar();
        
        lista.remover(1); 
        
        lista.listar();
        
        lista.remover(10);
    }
}
