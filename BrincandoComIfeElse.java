import java.util.Scanner;

public class BrincandoComIfeElse {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        float Nota1;
        float Nota2;
        float Nota3;
        float NotaFinal;

        System.out.println("Qual foi a primeira nota do aluno: ");
        Nota1 = ler.nextFloat();

        System.out.println("Qual foi a segunda nota do aluno: ");
        Nota2 = ler.nextFloat();

        System.out.println("Qual foi a terceira nota do aluno: ");
        Nota3 = ler.nextFloat();

        NotaFinal = (Nota1 + Nota2 + Nota3) / 3;

        if (NotaFinal >= 7.0 ) {
            System.out.println("Aluno aprovado");
        } else {
            System.out.println("Aluno reprovado");
        }

        String Formatar = String.format("%.2f" , NotaFinal);
        System.out.println("A nota final do aluno é: " + Formatar);


    }
}
