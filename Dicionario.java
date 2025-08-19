import java.util.HashMap;
import java.util.Scanner;

public class Dicionario {
    public static void main(String[] args){
        HashMap<String, String> palavras = new HashMap<>();
        palavras.put("Porta", "Door");
        palavras.put("Chave", "Key");
        palavras.put("Bebida", "Drink");
        palavras.put("Comida", "Food");
        palavras.put("Amanha", "Tomorrow");

         Scanner scan = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavraBuscada = scan.nextLine();
        
        String traducao = palavras.get(palavraBuscada);
        if(traducao == null){
            System.err.println("Traducao nao encontrada.");
        } else {
            System.out.println("Traducao: " + traducao);
        }
        scan.close(); 
    }
}
