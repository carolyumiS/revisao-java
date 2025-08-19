import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BuscaElemento{
    public static void main(String[] args){
        List<String> cidades = new ArrayList<>();
        cidades.add("Sao Paulo");
        cidades.add("Rio de Janeiro");
        cidades.add("Belo Horizonte");
        cidades.add("Salvador");
        cidades.add("Fortaleza");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma cidade: ");
        String cidadeBuscada  = scanner.nextLine();

        if (cidades.contains(cidadeBuscada)) {
            System.out.println("Cidade encontrada no indice: " + cidades.indexOf(cidadeBuscada));
        } else {
            System.out.println("Cidade nao encontrada na lista");
        }

        scanner.close(); 
    }
}
