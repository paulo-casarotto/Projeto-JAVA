import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        float maca = 0.30f;
        float UmaDuzia = 0.25f;
        float resultado;
        int QuantidadeDeMaca;

        System.out.print("Quantas maçãs você comprou? ");
        QuantidadeDeMaca = ler.nextInt();

        maca = maca * QuantidadeDeMaca;

        UmaDuzia = UmaDuzia * QuantidadeDeMaca;

        if (QuantidadeDeMaca <= 11) {
            String Maca = String.format("%.2f", maca);
            System.out.print("Você comprou menos de uma duzia: " + QuantidadeDeMaca + " ficou no valor de: " + Maca);

        } else {
            String umaDuzia = String.format("%.2f", UmaDuzia);
            System.out.print("Você comprou uma duzia ou mais maçãs, " + QuantidadeDeMaca + " ficou no valor de: " + umaDuzia);
        }

    }
}
