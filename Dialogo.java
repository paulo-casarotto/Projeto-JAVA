import javax.swing.JOptionPane;

public class Dialogo {
    public static void main (String[] args) {

        // exibe um diálogo com uma mensagem
        JOptionPane.showMessageDialog(null,"Seja bem vindo ao java");

        // pede para o usuário inserir seu nome
        String name = JOptionPane.showInputDialog("Qual é o seu nome?");

        // cria a mensagem
        String message = String.format("Bem vindo, %s, a programação java! ", name);

        // exibe a mensagem para cumprimentar o usuário pelo nome
        JOptionPane.showInputDialog(null, message);

        String SuaIdade = JOptionPane.showInputDialog("Qual é a sua idade?");

        String Idade = String.format("A sua idade é: " +SuaIdade);

        JOptionPane.showInputDialog(null, Idade);

    }
}
