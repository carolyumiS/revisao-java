import java.util.ArrayList;
import java.util.List;
import java.util.Collections; 

public class Ordenando{
    public static void main(String[] args){
        List<Integer> numeros = new ArrayList<>();

        for(int i=0; i < 10; i++){
            int randomNum = (int)(Math.random() * 101); 
            numeros.add(randomNum);
        }
        System.out.println("Lista original: " + numeros);
    
        Collections.sort(numeros);

        System.out.println("\nLista ordenada:");
        for(int j : numeros) {
            System.out.println(j);
        }
    }
}
