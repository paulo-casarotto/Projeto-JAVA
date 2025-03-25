import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int n1 , n2, n3;

        System.out.print("Digite o N1: ");
        n1 = ler.nextInt();

        System.out.print("Digite o N2: ");
        n2 = ler.nextInt();

        System.out.print("Digite o N3: ");
        n3 = ler.nextInt();


        if (n1 == n2 && n2 == n3) {
            System.out.print("São iguais");
        } else {

            if (n1 > n2 && n1 > n3) {
                System.out.print("N1 é o maior!");
            }
             else if (n2 > n1 && n2 > n3) {
                System.out.print("N2 é o maior!");
            }
             else  {
                System.out.print("N3 é o maior!");
            }
        }

    }
}
