//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        float HorasTrabalhadas;
        float ValorHora;
        float Salario;
        float Desconto;
        float SalarioComDesconto;

        System.out.println("Digite o numero de horas trabalhadas: ");
        HorasTrabalhadas = ler.nextFloat();

        System.out.println("Digite o valor da hora: ");
        ValorHora = ler.nextFloat();

        Salario = HorasTrabalhadas * ValorHora;
        System.out.println("O salario do mês é: " + Salario);

        Desconto = Salario * 0.06f;

        SalarioComDesconto = Salario - Desconto;

        String FormatarDesconto = String.format("%.2f",Desconto);
        System.out.println("O desconto fica: " + FormatarDesconto);

        String FormatarSalarioComDesconto = String.format("%.2f", SalarioComDesconto);
        System.out.println("O salario final e: " + FormatarSalarioComDesconto);




    }
}