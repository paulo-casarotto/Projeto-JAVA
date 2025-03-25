import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int numero1;
        int numero2;
        int numero3;
        int numero4;
        int numero5;

        // Solicitar os dois primeiros números
        System.out.print("Digite o primeiro numero: ");
        numero1 = ler.nextInt();

        System.out.print("Digite o segundo numero: ");
        numero2 = ler.nextInt();

        // Verificar se os números são iguais
        if (numero1 == numero2) {
            System.out.println("Os números são iguais.");
        } else {
            // Caso o numero1 seja par
            if (numero1 % 2 == 0) {
                System.out.print("Digite o terceiro numero: ");
                numero3 = ler.nextInt();

                // Comparação para o maior número entre numero1, numero2 e numero3
                if (numero1 > numero2 && numero1 > numero3) {
                    System.out.println("Numero1 é o maior valor.");
                } else if (numero2 > numero1 && numero2 > numero3) {
                    System.out.println("Numero2 é o maior valor.");
                } else {
                    System.out.println("Numero3 é o maior valor.");
                }
            }
            // Caso o numero1 seja ímpar
            else {
                System.out.print("Digite o terceiro numero: ");
                numero4 = ler.nextInt();
                System.out.print("Digite o quarto numero: ");
                numero5 = ler.nextInt();

                // Comparação para o maior número entre numero1, numero2, numero4 e numero5
                if (numero1 > numero2 && numero1 > numero4 && numero1 > numero5) {
                    System.out.println("Numero1 é o maior valor.");
                } else if (numero2 > numero1 && numero2 > numero4 && numero2 > numero5) {
                    System.out.println("Numero2 é o maior valor.");
                } else if (numero4 > numero1 && numero4 > numero2 && numero4 > numero5) {
                    System.out.println("Numero4 é o maior valor.");
                } else {
                    System.out.println("Numero5 é o maior valor.");
                }
            }
        }

        ler.close();
    }
}
