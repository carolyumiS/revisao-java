import java.util.HashMap;
import java.util.Scanner;

public class AgendaContatos {
    public static void main(String[] args){
        HashMap<String, String> agenda = new HashMap<>();
        Scanner scan = new Scanner(System.in);
        int opcao;

        do{
            System.out.println("\n===== AGENDA DE CONTATOS =====");
            System.out.println("1. Adicionar novo contato");
            System.out.println("2. Buscar telefone por nome");
            System.out.println("3. Listar todos os contatos");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opcao: ");
            opcao = scan.nextInt();
            scan.nextLine();
            
            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do contato: ");
                    String nome = scan.nextLine();
                    System.out.print("Digite o telefone: ");
                    String telefone = scan.nextLine();
                    agenda.put(nome, telefone);
                    System.out.println("Contato adicionado com sucesso!");
                    break;
                case 2: 
                    System.out.print("Digite o nome a buscar: ");
                    String nomeBusca = scan.nextLine();
                    String resultado = agenda.get(nomeBusca);
                    if (resultado != null) {
                        System.out.println("Telefone de " + nomeBusca + ": " + resultado);
                    } else {
                        System.out.println("Contato nao encontrado.");
                    }
                    break;
                case 3: 
                    if (agenda.isEmpty()) {
                        System.out.println("A agenda esta vazia.");
                    } else {
                        System.out.println("Contatos cadastrados:");
                        for (String i : agenda.keySet()) {
                            System.out.println("key: " + i + " value: " + agenda.get(i));
                        }
                    }
                    break;
                case 0: 
                    System.out.println("Encerrando a agenda...");
                    break;
                default:
                    System.out.println("Opcao invalida. Tente novamente.");
                    break;
            }
        } while (opcao != 0);
        scan.close();
    }
}

