import java.util.Scanner;

public class Exercicio14 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int n1;


        System.out.print("Digite o Primeiro numero(n1): ");
        n1 = ler.nextInt();

        // Verifica se o número é par
        if (n1 % 2 == 0) {
            System.out.print("Esse numero é par: " + n1);
        } else {
            System.out.print("Esse numero é impar:  " + n1);
        }

    }
}
