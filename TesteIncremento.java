import java.util.Scanner;

public class TesteIncremento {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

         int teste = 5;

         System.out.printf("Vamos testar o incremento: %d%n", teste);
        System.out.printf("Vamos testar o incremento: %d%n", teste++);
        System.out.printf("Vamos testar o incremento: %d%n", teste);

        System.out.println();

        teste = 5;
        System.out.printf("Vamos testar o incremento: %d%n", teste);
        System.out.printf("Vamos testar o incremento: %d%n", ++teste);
        System.out.printf("Vamos testar o incremento: %d%n", teste);



    }
}
