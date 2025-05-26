import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class Manga{
    private String titulo;
    private Double preco;

    public Manga(String titulo, Double preco) {
        Objects.requireNonNull(titulo);
        Objects.requireNonNull(preco);
        this.titulo = titulo;
        this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Manga manga = (Manga) o;
        return Objects.equals(titulo, manga.titulo) && Objects.equals(preco, manga.preco);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, preco);
    }

    @Override
    public String toString() {
        return "Manga{" +
                "titulo='" + titulo + '\'' +
                ", preco=" + preco +
                '}';
    }
}
