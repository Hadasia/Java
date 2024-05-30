import java.awt.*;

public class Titulo {
    public String titulo;
    public int duracaoEmMinutos;
    public  double avaliacao;
    public double totalAvaliacao;

    void displayInfo(){
        System.out.println("Filme: "+ titulo);
        System.out.println("Duração:  "+  duracaoEmMinutos  + " Minutos");
        System.out.println("Avaliação: "+  avaliacao);
        System.out.println("Total avaliação: " + totalAvaliacao);
        System.out.println("Media: " + getMediaAvali());

    }

    void avalie(int nota){
        avaliacao +=nota;
        totalAvaliacao++;
    }
    double  getMediaAvaliacao(){
        return avaliacao / totalAvaliacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public double getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(double avaliacao) {
        this.avaliacao = avaliacao;
    }

    public double getTotalAvaliacao() {
        return totalAvaliacao;
    }

    public void setTotalAvaliacao(double totalAvaliacao) {
        this.totalAvaliacao = totalAvaliacao;
    }
    void Avalie(int nota){
        avaliacao += nota;
        totalAvaliacao++;
    }

    public  double getMediaAvali(){
        return avaliacao / totalAvaliacao;
    }
}
