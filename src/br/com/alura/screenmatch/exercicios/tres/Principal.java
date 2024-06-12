package br.com.alura.screenmatch.exercicios.tres;

import br.com.alura.screenmatch.exercicios.tres.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>();
        numeros.add(3);
        numeros.add(1);
        numeros.add(2);
        System.out.println(numeros);
        Collections.sort(numeros);
        System.out.println(numeros);

        List<Titulo> titulos = new ArrayList<>();
        List<Titulo> tituloss = new LinkedList<>();
        titulos.add(new Titulo("Lost"));
        titulos.add(new Titulo("Era uma vez"));
        titulos.add(new Titulo("A casa de papel"));
        titulos.add(new Titulo("X-files"));
        Collections.sort(titulos);

        System.out.println(titulos);
        tituloss.add(new Titulo("Lost"));
        tituloss.add(new Titulo("Era uma vez"));
        tituloss.add(new Titulo("A casa de papel"));
        tituloss.add(new Titulo("X-files"));






    }
}
