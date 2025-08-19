import java.util.TreeSet;

public class Produto implements Comparable<Produto> { 
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public double getPreco() { return preco; }
    public void setPreco(double preco) { this.preco = preco; }

    @Override
    public int compareTo(Produto outro) { 
        return Double.compare(this.preco, outro.preco);
    }

    @Override
    public String toString() {
        return nome + " - R$" + preco;
    }

    public static void main(String[] args){
        TreeSet<Produto> produtos = new TreeSet<>();
        
        produtos.add(new Produto("Notebook", 3500.00));
        produtos.add(new Produto("Smartphone", 2500.00));
        produtos.add(new Produto("Tablet", 1800.00));
        produtos.add(new Produto("Mouse", 120.00));
        
        for(Produto p : produtos) {
            System.out.println(p);
        }
    }
}
