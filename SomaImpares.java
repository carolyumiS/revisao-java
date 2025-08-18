public class SomaImpares {
    public static void main(String[] args) {
        int[] numeros = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int soma = 0;

        for(int numero : numeros){
            if(numero%2 != 0){
                soma = soma + numero;
            }
        }
        System.out.printf("%nO valor da soma dos números ímpares é: %d %n%n", soma);
    }
}
