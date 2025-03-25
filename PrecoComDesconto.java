import java.util.Scanner;

public class PrecoComDesconto {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        float PrecoDoProduto;
        float PercentualDesconto;
        float Desconto;
        float PrecoFinal;

        System.out.print("Qual o valor do produto? ");
        PrecoDoProduto = ler.nextFloat();

        System.out.print("Qual o percentual do desconto? ");
        PercentualDesconto = ler.nextFloat();

        Desconto = PrecoDoProduto * PercentualDesconto / 100;

        PrecoFinal = PrecoDoProduto - Desconto;


        System.out.print("O preço final com o desconto é: " + PrecoFinal);





    }

}
