import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        // Criando o objeto Scanner para leitura de dados
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite o preço de tabela: R$ ");
        float precoTabela = scanner.nextFloat();

        System.out.print("Digite o número de vezes para o pagamento: ");
        int numeroVezes = scanner.nextInt();

        // Variáveis para o cálculo do preço total e valor da parcela
        float precoTotal;
        float valorParcela;

        // Cálculos conforme o número de vezes
        if (numeroVezes == 1) {
            // À vista (desconto de 2,5%)
            precoTotal = precoTabela * (1 - 0.025f);  // Desconto de 2,5%
        } else if (numeroVezes >= 2 && numeroVezes <= 5) {
            // De 2 até 5 vezes (sem desconto ou acréscimo)
            precoTotal = precoTabela;
        } else if (numeroVezes >= 6 && numeroVezes <= 10) {
            // De 6 até 10 vezes (juros de 6%)
            precoTotal = precoTabela * (1 + 0.06f);  // Juros de 6%
        } else if (numeroVezes >= 11 && numeroVezes <= 15) {
            // De 11 até 15 vezes (juros de 13%)
            precoTotal = precoTabela * (1 + 0.13f);  // Juros de 13%
        } else {
            // Caso o número de vezes não esteja dentro do intervalo permitido
            System.out.println("Número de vezes inválido.");
            return;
        }

        // Calculando o valor de cada parcela
        valorParcela = precoTotal / numeroVezes;

        // Exibindo os resultados
        System.out.println("PREÇO DE TABELA: R$ " + String.format("%.2f", precoTabela));
        System.out.println("NUM. DE VEZES: " + numeroVezes);
        System.out.println("VALOR DE CADA PARCELA: R$ " + String.format("%.2f", valorParcela));
        System.out.println("PREÇO TOTAL: R$ " + String.format("%.2f", precoTotal));

        // Fechar o scanner
        scanner.close();
    }
}
