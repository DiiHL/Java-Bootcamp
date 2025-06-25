package com.services;

import com.Model.Filme;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CatalogoFilme {
    private final List<Filme> listFilme = new ArrayList<>();

    public void adicionarFilme(String titulo, String diretor, int anoAlocado, double nota) {
        Filme novoFilme = new Filme(titulo, diretor, anoAlocado, nota);

        if (!listFilme.contains(novoFilme)) {
            listFilme.add(novoFilme);
            System.out.printf("Filme: %s adicionado com sucesso\n", novoFilme.getTitulo());
        } else {
            System.out.println("Filme existente");
        }
    }

    public void listarFilmes() {
        for (Filme filme : listFilme) {
            System.out.println(filme);
        }
    }

    public void listarFilmesComNotaAlta() {
        for (Filme filme : listFilme) {
            if (filme.getNota() > 8) {
                System.out.println(filme);
            }
        }
    }

    public void ordenarPorAno() {
        Collections.sort(listFilme);
    }

    public void ordenarPorNota() {
        listFilme.sort(Comparator.comparingDouble(Filme::getNota));
    }
}
