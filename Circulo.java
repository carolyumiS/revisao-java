import java.lang.Math;

public class Circulo {
    private double raio;

    public Circulo(double raio) {
        setRaio(raio);
    }

    public double getRaio() { return raio; }

  
  public void setRaio(double raio) {
        if (raio <= 0.0) {
            throw new IllegalArgumentException("O Raio deve ser um número positivo.");
        }
        this.raio = raio;
    }

    public double calcularArea(){
        return Math.PI * Math.pow(raio, 2);
    }

    public static void main(String[] args) {
        Circulo meuCirculo = new Circulo(5.0);
        System.out.println("Área: " + meuCirculo.calcularArea());
    }
}
