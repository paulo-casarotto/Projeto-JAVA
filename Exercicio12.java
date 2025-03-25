import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int senha;


        System.out.print("Digite sua senha: ");
        senha = ler.nextInt();

        if (senha == 1234) {
            System.out.print("ACESSO PERMITIDO ");
        } else {
            System.out.print("ACESSO NEGADO ");
        }




    }
}
