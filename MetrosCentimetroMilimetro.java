import java.util.Scanner;

public class MetrosCentimetroMilimetro {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        float Metros;
        float centimetros;
        float Milimetros;

        System.out.println("Digite um valor em metros: " );
        Metros = ler.nextFloat();

        centimetros = Metros * 100;
        Milimetros = Metros * 1000;
        System.out.println("A confersão ficou de " + Metros + " M , para " + centimetros + " cm, e " + Milimetros + " ml ");

    }
}
