import java.util.TreeSet;

public class NomeOrdemAlfabetica{
    public static void main(String[] args){
        TreeSet<String> nomes = new TreeSet<>();
        nomes.add("Diogo");
        nomes.add("Carolina");
        nomes.add("Caroline");
        nomes.add("Gabriel");
        nomes.add("Celine");

        for(String nome: nomes){
            System.out.println(nome);
        }
    }
}
