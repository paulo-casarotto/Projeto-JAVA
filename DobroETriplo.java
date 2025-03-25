import java.util.Scanner;

public class DobroETriplo {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int Numero;
        int Dobro;
        int Triplo;

        System.out.println("Digite um numero: ");
        Numero = ler.nextInt();

        Dobro = Numero * 2;
        Triplo = Numero * 3;

        System.out.println("O dobro de: " + Numero + " é " + Dobro + " , e o Triplo é: " + Triplo);






    }
}
