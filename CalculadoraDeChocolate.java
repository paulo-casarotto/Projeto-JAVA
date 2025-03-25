import java.util.Scanner;

public class CalculadoraDeChocolate {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int Chocolates;
        int Amigos;
        int DivisaoChocolate;
        int Sobra;

        System.out.println("Quantos chocolates você tem? ");
        Chocolates = ler.nextInt();

        System.out.println("Quantos amigos vc tem? ");
        Amigos = ler.nextInt();


        DivisaoChocolate = Chocolates / Amigos;

        Sobra = Chocolates % Amigos;

        System.out.println("Cada amigo vai receber: " + DivisaoChocolate);

        System.out.println("E você vai ficar com: " + Sobra);




    }
}
