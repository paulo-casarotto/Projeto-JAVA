public class EstudanteTeste {
    public static void main(String[] args) {
        Student conta1 = new Student("Paulo Henrique", 100.0);
        Student conta2 = new Student("Carlos Heiberg", 40.0);

        System.out.printf("%s Sua nota é: %s%n", conta1.recuperaNome(),conta1.getLetraNota());
        System.out.printf("%s Sua nota é: %s%n", conta2.recuperaNome(),conta2.getLetraNota());
    }
}
