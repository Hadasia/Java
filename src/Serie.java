public class Serie extends Filme {
    int temporada;
    int episodio;


    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    public int getEpisodio() {
        return episodio;
    }

    public void setEpisodio(int episodio) {
        this.episodio = episodio;
    }

    @Override
    public void displayInfo(){
        System.out.println("Serie: "+ this.titulo);
        System.out.println("Temporada:  "+  this.temporada );
        System.out.println("Epísodio: " +  this.episodio);
        System.out.println("Avaliação: "+  this.avaliacao);
        System.out.println("Total avaliação: " + this.totalAvaliacao);

    }

}
