
import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int Valor1;
        int Valor2;

        System.out.print("Digite o primeiro valor: ");
        Valor1 = ler.nextInt();

        System.out.print("Digite o primeiro valor: ");
        Valor2 = ler.nextInt();

        if (Valor1 > Valor2) {
            System.out.print(Valor1 + ", " + Valor2);
        } else {
            System.out.print(Valor2 + ", " + Valor1);
        }


    }
}