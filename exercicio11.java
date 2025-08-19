import java.util.LinkedList;

public class ListaAtendimento{
    public static void main(String[] args){
        LinkedList<String> clientes = new LinkedList<String>();
        clientes.addLast("Gabriel Mateus");
        clientes.addLast("Carolina Yumi");
        clientes.addLast("Celine Galdino");
        clientes.addLast("Diogo Almeida");
        clientes.addLast("Maria Jose");
        System.out.println("Lista Inicial");
        System.out.println(clientes);

        clientes.removeFirst();
        clientes.removeFirst();
        System.out.println("\n" + "Lista apos 2 atendimentos");
        System.out.println(clientes);

        clientes.addFirst("Fulano Idoso");
        clientes.addFirst("Beltrana Gravida");
        System.out.println("\n" + "Lista com 2 prioritarios");
        System.out.println(clientes);
    }
}
