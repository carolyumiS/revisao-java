import java.util.LinkedHashMap;

public class OrdemCadastro {
    public static void main(String[] args){
        LinkedHashMap<Integer, String> produtos = new LinkedHashMap<>();
        produtos.put(1, "Shampoo");
        produtos.put(2, "Condicionador");
        produtos.put(3, "Sabonete");
        produtos.put(4, "Escova");
        produtos.put(5, "Desodorante");
        
        for(Integer produto : produtos.keySet()){
            System.out.println("Chave: " + produto + "  Produto: " + produtos.get(produto));
        }
    }
}
