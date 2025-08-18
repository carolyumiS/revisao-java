import java.util.Scanner;

public class Adivinhe {
    public static void main(String[] args) {
        System.out.printf("Tente adivinhar o número!%n%n");
        int randomNum = (int)(Math.random() * 101); 

        Scanner guess = new Scanner(System.in);

        int numGuess = 111;
        int tentativas = 0;

        while(numGuess != randomNum){
            System.out.print("Digite um numero entre 0 e 100: ");
            numGuess = guess.nextInt();

            tentativas++;

            if(numGuess == randomNum){
                System.out.printf("%nParabéns! Você acertou!%nO numero era %d.%n", randomNum);
            }else if(numGuess > randomNum){
                System.out.println("Muito alto! Tente um número menor!");
            } else {
                System.out.println("Muito baixo! Tente um número maior!");
            }
        }
        System.out.printf("%nVocê tentou %d vezes!%n%n", tentativas);
        guess.close(); 
    }
}
