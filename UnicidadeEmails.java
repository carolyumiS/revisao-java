import java.util.HashSet;
import java.util.Set;

public class UnicidadeEmails{
    public static void main(String[] args){
        Set<String> email = new HashSet<>();
        email.add("carol@gmail.com");
        email.add("gabriel@gmail.com");
        email.add("maria@gmail.com");

        System.out.println("Emails sem repeticao: " + email);

        email.add("carol@gmail.com");
        System.out.println("\n" + "Tamanho da lista apos repeticao: " + email.size());
    }
}