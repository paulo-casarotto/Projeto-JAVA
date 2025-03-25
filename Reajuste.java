import java.util.Scanner;

public class Reajuste {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        float SalarioMensal;
        float Reajuste;
        float ValorDoReajuste;
        float SalarioComReajuste;

        // Solicita o salário mensal
        System.out.println("Quanto você ganha por mês? ");
        SalarioMensal = ler.nextFloat();

        // Solicita o percentual do reajuste
        System.out.println("Percential do reajuste (2025): ");
        Reajuste = ler.nextFloat();

        // Calcula o valor do reajuste
        ValorDoReajuste = SalarioMensal * (Reajuste / 100);

        // Calcula o salário com o reajuste
        SalarioComReajuste = SalarioMensal + ValorDoReajuste;

        // Exibe o valor do reajuste e o novo salário
        String FormatarReajuste = String.format("%.2f", ValorDoReajuste);
        System.out.println("O valor do rajuste é: " + FormatarReajuste);

        String FormatarAposReajuste = String.format("%.2f", SalarioComReajuste);
        System.out.println("O valor do salario após o reajuste é de: " + FormatarAposReajuste);

    }

}
