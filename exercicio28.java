import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class InverterFrase {
    public static void main(String[] args){
        Deque<String> pilhaPalavras = new ArrayDeque<>();

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = scan.nextLine();

        String regex = "[,\\.\\s]";
        String[] palavras = frase.split(regex);

        for(String palavra : palavras){
            pilhaPalavras.add(palavra);
        }
        while(pilhaPalavras.size() >= 0){
            System.out.print(pilhaPalavras.removeLast() + " ");
        }
        scan.close(); 
    }
}
