import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        float Homem = 72.7f;
        float Mulher = 62.1f;
        float Altura;
        int Sexo;


        System.out.print("Qual é a sua altura? ");
        Altura = ler.nextFloat();

        System.out.print("Qual é o seu genero 1 M e 2 F: ");
        Sexo = ler.nextInt();

        if (Sexo == 1)  {
            Homem = (Homem * Altura) - 58;
            String Fort = String.format("%.2f", Homem);
            System.out.print("Seu peso ideal é: " + Fort);
        }
        if (Sexo == 2)  {
            Mulher = (Mulher * Altura) - 44.7f;
            String forma = String.format("%.2f", Mulher);
            System.out.print("Seu peso ideal é: " + forma);
        }






    }
}