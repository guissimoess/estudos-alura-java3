package br.com.alura.screenmatch.exercicios.desafio;

public class Compra implements Comparable<Compra> {
    private String descricao;
    private double valor;

    public Compra(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    public String toString() {
        return "Compra:  " + descricao + " no valor de R$ " + valor;
    }

    @Override
    public int compareTo(Compra outraCompra) {
        return Double.valueOf(this.valor).compareTo(outraCompra.valor);
    }
}
