public class Student {

    private String nome;
    private double media;

    public Student(String nome, double media) {
        this.nome = nome;

        if (media > 0.0)
            if (media <= 100.0)
                this.media = media;
    }

    // define o nome de Student
    public void setarNome(String name) {
        this.nome = nome;
    }

    public String recuperaNome() {
        return nome;
    }

    public void setMedia(double estudanteMedia) {
        if (media > 0.0)
            if (media <= 100.0)
                this.media = media;
    }

    public double recuperaMedia() {
        return media;
    }

    public String getLetraNota() {
        String LetraNota = "";
        if (media >= 90.0)
            LetraNota = "A";
        else if (media >= 80.0)
            LetraNota = "C";
        else if (media >= 70.0)
            LetraNota = "D";
        else if (media >= 60.0)
            LetraNota = "E";
        else
            LetraNota = "F";

        return LetraNota;

    }

}
