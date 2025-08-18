import java.util.Scanner;

//pode ser necessário alterar o nome da classe
public class Media { 
    public static void main(String[] args) {
        Scanner aluno = new Scanner(System.in);

        System.out.print("Digite sua primeira nota: ");
        float nota1 = aluno.nextFloat();

        System.out.print("Digite sua segunts nota: ");
        float nota2 = aluno.nextFloat();

        System.out.print("Digite sua segunts nota: ");
        float nota3 = aluno.nextFloat();

        float media = (nota1 + nota2 + nota3)/3;

        System.out.printf("Sua média final é:%.2f %n%n", media);
        aluno.close(); 

        if(media >= 7){
            System.out.println("Aluno aprovado!");
        }else if(media >= 5){
            System.out.println("Aluno em recuperação!");
        }else{
            System.out.println("Aluno reprovado!");
        }
        
    }
}

