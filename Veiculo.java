public class Veiculo {
    private String marca;
    private String modelo;

    public Veiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }

    @Override
    public String toString() {
        return "Marca: " + marca + "\n" +
               "Modelo: " + modelo;
    }
}

class Carro extends Veiculo {
    private int numeroDePortas; 

    public Carro(String marca, String modelo, int numeroDePortas) {
        super(marca, modelo);
        this.numeroDePortas = numeroDePortas;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Numero de Portas: " + numeroDePortas;
    }
}

class Moto extends Veiculo {
    private int cilindradas; 

    public Moto(String marca, String modelo, int cilindradas) {
        super(marca, modelo);
        this.cilindradas = cilindradas;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Numero de Cilindradas: " + cilindradas;
    }
}