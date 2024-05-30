//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Filme filme = new Filme();
        filme.setTitulo("Era do gelo");
        filme.setDuracaoEmMinutos(180);

        filme.avalie(9);
        filme.avalie(9);
        filme.avalie(10);

        filme.displayInfo();

        Serie serie = new Serie();
       serie.setTitulo("Friends");
       serie.setDuracaoEmMinutos(45);
       serie.avalie(9);
       serie.avalie(8);
       serie.avalie(7);
       serie.setEpisodio(6);
       serie.setTemporada(3);
       serie.displayInfo();
    }
}