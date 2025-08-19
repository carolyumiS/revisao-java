import java.util.TreeMap;

public class ListagemOrdenada {
    public static void main(String[] args){
        TreeMap<String, Double> notas = new TreeMap<>();

        notas.put("Carolina", 8.0);
        notas.put("Gabriel", 2.2);
        notas.put("Celine", 7.4);
        notas.put("Fulano", 4.5);
        notas.put("Diogo", 5.9);

        System.out.println(notas);
    }
}
