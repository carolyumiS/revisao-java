import java.util.HashMap;
import java.util.Map;

public class FreqPalavras {
    public static void main(String[] args) {
        String texto = "Java e uma linguagem de programacao. Java e usada para desenvolver aplicacoes. Programadores gostam de Java por sua portabilidade e desempenho.";

         String[] palavras = texto.split("\\s+");

         HashMap<String, Integer> frequenciaPalavras = new HashMap<>();

           for (String palavra : palavras) {
            if (palavra.isEmpty()) continue;
            frequenciaPalavras.put(palavra, frequenciaPalavras.getOrDefault(palavra, 0) + 1);
        }

        System.out.println("Contagem de palavras:");
        for (Map.Entry<String, Integer> entrada : frequenciaPalavras.entrySet()) {
            System.out.println(entrada.getKey() + ": " + entrada.getValue());
        }
    }
}
