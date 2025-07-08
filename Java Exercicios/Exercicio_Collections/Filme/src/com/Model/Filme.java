package com.Model;

import java.util.Objects;

public class Filme implements Comparable<Filme> {
    private String titulo;
    private String diretor;
    private int anoAlocado;
    private double nota;

    public Filme(String titulo, String diretor, int anoAlocado, double nota) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.anoAlocado = anoAlocado;
        this.nota = nota;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public int getAnoAlocado() {
        return anoAlocado;
    }

    public void setAnoAlocado(int anoAlocado) {
        this.anoAlocado = anoAlocado;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public int compareTo(Filme outroFilme) {
        return Integer.compare(this.anoAlocado, outroFilme.getAnoAlocado());
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Filme filme = (Filme) o;
        return anoAlocado == filme.anoAlocado && Double.compare(nota, filme.nota) == 0 && Objects.equals(titulo, filme.titulo) && Objects.equals(diretor, filme.diretor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, diretor, anoAlocado, nota);
    }

    @Override
    public String toString() {
        return "Filme{" +
                "titulo='" + titulo + '\'' +
                ", diretor='" + diretor + '\'' +
                ", anoAlocado=" + anoAlocado +
                ", nota=" + nota +
                '}';
    }
}
