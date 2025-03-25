import java.util.Scanner;

public class AccountTest {
    public static void main (String[] args) {
        Scanner ler = new Scanner(System.in);

        Account mayAccount = new Account(); // cria um objeto ACcount e o atribui a myAccount

        // exibe o valor inicial do nome (null)
        System.out.printf("Nome inicial: %s%n%n", mayAccount.getName());


        // solicita e lê o nome
        System.out.println("Porfavor insira o seu nome: ");
        String theName = ler.nextLine(); // lê uma linha da texto
        mayAccount.setName(theName); //insere theName em myAccount
        System.out.println(); // gera saida de uma linha em branco

        // exibe o nome aramazenado no objeto myAccount
        System.out.printf("Nome em objeto myAccount é: %n%s%n ", mayAccount.getName());


    }
}