import java.util.Scanner;

public class Exercicio09 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura dos lados do triângulo
        System.out.print("Digite o valor do lado A: ");
        double a = scanner.nextDouble();

        System.out.print("Digite o valor do lado B: ");
        double b = scanner.nextDouble();

        System.out.print("Digite o valor do lado C: ");
        double c = scanner.nextDouble();

        // Verificando se os lados formam um triângulo
        if (a < b + c && b < a + c && c < a + b) {
            // Identificando o tipo de triângulo
            if (a == b && b == c) {
                System.out.println("O triângulo é Equilátero.");
            } else if (a == b || a == c || b == c) {
                System.out.println("O triângulo é Isósceles.");
            } else {
                System.out.println("O triângulo é Escaleno.");
            }
        } else {
            System.out.println("Os lados fornecidos não formam um triângulo.");
        }

        // Fechando o scanner
        scanner.close();
    }
}
