import java.util.Scanner;
import java.text.DecimalFormat;

public class Coracao {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int AnosDeVida;
        int BatidasPorSegundo;
        int BatimentosPorMinuto;
        int BatimentosPorHora;
        int BatimentosPorDia;
        int BatimentosPorAno;
        long Resultado;
        System.out.println("Quantos anos de vida? ");
        AnosDeVida = ler.nextInt();

        BatidasPorSegundo = 1; // O coração bate uma vez por segundo
        BatimentosPorMinuto = 60; // 60 segundos por minuto
        BatimentosPorHora = 60 * BatimentosPorMinuto; // 60 minutos por hora
        BatimentosPorDia = 24 * BatimentosPorHora; // 24 horas por dia
        BatimentosPorAno = 365 * BatimentosPorDia; // 365 dias por ano

        // Calcular o total de batimentos
        Resultado = BatidasPorSegundo * BatimentosPorAno * AnosDeVida;

        DecimalFormat formatador = new DecimalFormat("#,###");

        System.out.println("Seu coração bateu: " + formatador.format(Resultado) + " até agora");

        ler.close();  // Fechar o scanner para evitar vazamento de recursos


    }
}
