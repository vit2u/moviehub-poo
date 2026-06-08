package br.com.cdl.moviehub.calculos;

import br.com.cdl.moviehub.modelos.Classificavel;

public class CalculadoraDeTempo {

    private int tempoTotal;

    public void inclui(Classificavel titulo) {
        tempoTotal += titulo.getDuracaoTotal();
    }

    public int getTempoTotal() {
        return tempoTotal;
    }
}
