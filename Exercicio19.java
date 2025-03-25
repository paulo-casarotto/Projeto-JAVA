import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int idade;
        float peso;

        // Leitura dos dados
        System.out.print("Digite a sua idade: ");
        idade = ler.nextInt();

        System.out.print("Digite o seu peso: ");
        peso = ler.nextFloat();

        // Determinação da categoria com base na idade e peso
        if (idade <= 12) {
            if (peso <= 40) {
                System.out.println("Infantil");
            }
        } else if (idade >= 13 && idade <= 16) {
            if (peso <= 40) {
                System.out.println("Juvenil leve");
            } else {
                System.out.println("Juvenil pesado");
            }
        } else if (idade >= 17 && idade <= 24) {
            if (peso <= 45) {
                System.out.println("Senior leve");
            } else if (peso > 45 && peso <= 60) {
                System.out.println("Senior médio");
            } else {
                System.out.println("Senior pesado");
            }
        } else if (idade >= 25) {
            if (peso > 60) {
                System.out.println("Veterano");
            }
        }
    }
}
