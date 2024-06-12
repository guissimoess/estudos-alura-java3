package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String diretor;

    public Filme(String nome, int anoDeLancamento, String diretor) {
        super(nome, anoDeLancamento);
        this.diretor = diretor;
    }


    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public String toString() {
        return "Filme: " + getNome() + " - " + getAnoDeLancamento();
    }

    @Override
    public int getClassificacao() {
        return (int) pegaMedia() / 2;
    }
}
