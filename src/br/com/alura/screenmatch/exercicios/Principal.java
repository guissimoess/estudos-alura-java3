package br.com.alura.screenmatch.exercicios;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();
        Pessoa pessoa3 = new Pessoa();
        ArrayList<Pessoa> pessoas = new ArrayList<>();

        pessoa1.setNome("João");
        pessoa1.setIdade(12);
        pessoa2.setNome("Paulo");
        pessoa2.setIdade(15);
        pessoa3.setNome("Julio");
        pessoa3.setIdade(11);

        pessoas.add(pessoa1);
        pessoas.add(pessoa2);
        pessoas.add(pessoa3);

        System.out.println(pessoas.size());
        System.out.println(pessoas.get(0));
        System.out.println(pessoas.toString());

    }
}
