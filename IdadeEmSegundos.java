import java.util.Scanner;
import java.text.DecimalFormat;

public class IdadeEmSegundos {
    public static void main (String[] args) {
        Scanner ler = new Scanner(System.in);

        int SuaIdade;
        int Ano;
        int Dia;
        int Hora;
        int Minutos;
        int Segundos;
        long Resultado; // 'long' para evitar overflow em idades grandes

        System.out.print("Digite a sua idade: ");
        SuaIdade = ler.nextInt();

        // Cálculos das unidades de tempo
        Segundos = 1;
        Minutos = 60;
        Hora = 60 * Minutos;
        Dia = 24 * Hora;
        Ano = 365 * Dia;    // Aproximação usando 365 dias por ano

        Resultado = (long) Ano * SuaIdade;

        DecimalFormat formatador = new DecimalFormat("#,###");

        System.out.print("A sua idade, em segundos é de: " + formatador.format(Resultado));


        // Fechar o scanner
        ler.close();

    }



}
