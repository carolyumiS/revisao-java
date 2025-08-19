import java.util.ArrayList;
import java.util.HashSet;

public class Sorteio{
    public static void main(String[] args){
        ArrayList<String> nomes = new ArrayList<String>();
        nomes.add("Carolina");
        nomes.add("Celine");
        nomes.add("Gabriel");
        nomes.add("Celine");
        nomes.add("Diogo");
        nomes.add("Carolina");

        HashSet<String> semRepeticao = new HashSet<>(nomes);

        ArrayList<String> participantes = new ArrayList<>(semRepeticao);

        int randomNum = (int)(Math.random() * participantes.size()); 
        System.out.println("O participante escolhido foi: " + participantes.get(randomNum));
    }
}