package br.com.cdl.moviehub.modelos;

public class Filme extends Titulo implements Classificavel {

    private String diretor;
    private String genero;
    private int totalEmMinutos;

    @Override
    public void exibeFichaTecnica() {
        super.exibeFichaTecnica();
        System.out.println("Diretor: " + diretor);
        System.out.println("Gênero: " + genero);
        System.out.println("Duração: " + totalEmMinutos + " minutos");
        System.out.println("Média das avaliações: " + pegaMedia());
    }

    @Override
    public int getDuracaoTotal() {
        return totalEmMinutos;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getTotalEmMinutos() {
        return totalEmMinutos;
    }

    public void setTotalEmMinutos(int totalEmMinutos) {
        this.totalEmMinutos = totalEmMinutos;
    }
}
