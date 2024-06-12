package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {

        Filme meuFilme = new Filme("O poderoso chefão" , 1970, "Francis Ford Coppola");
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Avatar", 2023, "James Cameron");
        outroFilme.avalia(1);
        Serie lost = new Serie("Lost", 2000);
        lost.avalia(2);
        Filme filmeDoPaulo = new Filme("Dogville", 2000, "Lars Von Trier");
        filmeDoPaulo.avalia(10);

        Filme f1 = filmeDoPaulo;


        List<Titulo> titulos = new ArrayList<>();

        titulos.add(lost);
        titulos.add(meuFilme);
        titulos.add(outroFilme);
        titulos.add(filmeDoPaulo);

        for (Titulo titulo : titulos) {
            System.out.println(titulo.getNome());
            if (titulo instanceof Filme filme && filme.getClassificacao() > 1) {
                System.out.println(filme.getClassificacao());
            }
        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Will Smith");
        buscaPorArtista.add("Francis Ford Coppola");
        System.out.println(buscaPorArtista);
        Collections.sort(buscaPorArtista);
        System.out.println(buscaPorArtista);

        Collections.sort(titulos);
        System.out.println(titulos);


        titulos.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println(titulos);

    }
}
