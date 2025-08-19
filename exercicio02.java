import java.util.Scanner;

//pode ser necessário alterar o nome do arquivo/Classe
public class Tabuada {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        int n1 = numero.nextInt();

        System.out.printf("%nTabuada do %d: %n", n1);
        for (int i=1; i<11; i++){
            int multiply = n1 * i;
            System.out.printf("%d x %d = %d %n", n1, i, multiply);
        }

        numero.close(); 
    }
}
