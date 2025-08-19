import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto: " + nome + " | Preco: R$" + String.format("%.2f", preco);
    }
}

public class CatalogoProdutos {
    public static void main(String[] args) {
        Map<String, List<Produto>> catalogo = new TreeMap<>();
        
        catalogo.put("Eletronicos", Arrays.asList(
            new Produto("Smartphone", 1599.90),
            new Produto("Notebook", 3549.99),
            new Produto("Tablet", 899.50)
        ));
        
        catalogo.put("Livros", Arrays.asList(
            new Produto("Java para leigos", 299.80),
            new Produto("Tutorial programacao", 189.90)
        ));
        
        catalogo.put("Moveis", Arrays.asList(
            new Produto("Cadeira Gamer", 799.00),
            new Produto("Mesa de escritorio", 1200.00)
        ));

        String categoria = "Eletronicos";
        System.out.println("Produtos da categoria '" + categoria + "':");
        
        List<Produto> produtos = catalogo.get(categoria);
        
        if (produtos != null) {
            for (Produto p : produtos) {
                System.out.println(" - " + p);
            }
        } else {
            System.out.println("Categoria não encontrada!");
        }
    }
}