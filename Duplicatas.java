import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Duplicatas{
    public static void main(String[] args){
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(4);
        numeros.add(5);
        
        Set<Integer> numerosSemDuplicatas = new HashSet<>(numeros);
        
        List<Integer> listaSemDuplicatas = new ArrayList<>(numerosSemDuplicatas);
        
        System.out.println("Lista original: " + numeros);
        System.out.println("Lista sem duplicatas: " + listaSemDuplicatas);
    }
}