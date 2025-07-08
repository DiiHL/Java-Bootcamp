package Modelo;

import java.util.Objects;

public class Book implements Comparable<Book> {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private double preco;

    public Book(String titulo, String autor, int anoPublicacao, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return anoPublicacao == book.anoPublicacao && Double.compare(preco, book.preco) == 0 && Objects.equals(titulo, book.titulo) && Objects.equals(autor, book.autor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, autor, anoPublicacao, preco);
    }

    @Override
    public String toString() {
        return "Modelo.Book{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anoPublicacao=" + anoPublicacao +
                ", preco=" + preco +
                '}';
    }

    @Override
    public int compareTo(Book o) {
        return Integer.compare(this.anoPublicacao, o.anoPublicacao);
    }
}
