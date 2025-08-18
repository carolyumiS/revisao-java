public class Carro {
    private String marca;
    private String modelo;
    private int ano;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public int getAno() { return ano; }

    public void exibirInfo(){
        System.out.println(
            "A marca do carro é: " + marca + "\n" +
            "O modelo do carro é: " + modelo + "\n" +
            "O carro é do ano " + ano
        );
    }

    public static void main(String[] args) {
        Carro carroTeste = new Carro("Volkswagen", "Gol", 2023);
        carroTeste.exibirInfo();
    }
}
