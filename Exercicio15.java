import java.util.Scanner;

public class Exercicio15 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);


        int n1;
        int n2;

        System.out.print("Digite o primeiro numero: ");
        n1 = ler.nextInt();

        System.out.print("Digite o segundo numero: ");
        n2 = ler.nextInt();

        if (n1 > n2) {
            System.out.print(" n1 é maior, n2 é menor ");

        }
        if (n2 > n1) {
            System.out.print("n2 é maior, n1 é menor ");
        }
        if (n1 == n2){
            System.out.print("n2 e n1 são iguais ");
        }

    }
}
