package br.com.alura.screenmatch.exercicios.dois;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();
        Produto prod1 = new Produto("Camiseta", 50.0, 10);
        Produto prod2 = new Produto("Calça", 100.0, 5);
        Produto prod3 = new Produto("Boné", 30.0, 20);
        produtos.add(prod1);
        produtos.add(prod2);
        produtos.add(prod3);

        System.out.println(produtos.size());
        System.out.println(produtos.get(0).getNome());

        System.out.println(produtos);

    }
}
