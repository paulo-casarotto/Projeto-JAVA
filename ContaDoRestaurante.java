import java.text.Format;
import java.util.Scanner;

public class ContaDoRestaurante {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);

        float ValorDaConta;
        int QuantidadeDePessoas;
        float Divisao;

        System.out.println("Digite o valor da conta: ");
        ValorDaConta = ler.nextFloat();

        System.out.println("Vão dividir em quantas? ");
        QuantidadeDePessoas = ler.nextInt();

        Divisao = ValorDaConta / QuantidadeDePessoas;

        String FormatarDivisao = String.format("%.2f" , Divisao);
        System.out.println("Cada um deve pagar: " + FormatarDivisao);


    }
}
