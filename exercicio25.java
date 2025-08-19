import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class PilhaLivros {
    public static void main(String[] args){
        Deque<String> pilha = new ArrayDeque<String>();
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o nome do primeiro livro: ");
        String livro1 = scan.nextLine();
        pilha.push(livro1);

        System.out.print("Digite o nome do segundo livro: ");
        String livro2 = scan.nextLine();
        pilha.push(livro2);

        System.out.print("Digite o nome do terceiro livro: ");
        String livro3 = scan.nextLine();
        pilha.push(livro3);

        System.out.println("\nLivro removido: " + pilha.pop());
        System.out.println("\nVendo o livro no topo: " + pilha.peekFirst());
        scan.close(); 
    }
}
