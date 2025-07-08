package com.model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PlataformaEnsino {

    List<Curso> cursoList = new ArrayList<>();

    public void adicionarCurso(String nomeDoCurso, String instrutor) {
        Curso curso = new Curso(nomeDoCurso, instrutor);
        cursoList.add(curso);
    }

    public void listaCurso() {
        cursoList.sort(Comparator.comparing(Curso::getNomeDoCurso));
    }

    public void buscarPorNome(String nome) {
        for (Curso curso : cursoList) {
            if (curso.getNomeDoCurso().equalsIgnoreCase(nome)) {
                System.out.println(curso);
                return;
            }
        }
        System.out.println("Curso não encontrado");
    }

    public void matricularAlunoNoCurso(String nomeCurso, Aluno aluno) {

        for (Curso curso : cursoList) {
            if (curso.getNomeDoCurso().equalsIgnoreCase(nomeCurso)) {
                curso.adicionarAluno(aluno);
            }
        }

    }
}
