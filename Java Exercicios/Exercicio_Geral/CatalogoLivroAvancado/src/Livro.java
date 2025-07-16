import java.util.Objects;

public class Livro {
    private final String titulo;
    private final String autor;
    private final double preco;
    private boolean disponivel;

    public Livro(String titulo, String autor, double preco, boolean disponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
        this.disponivel = disponivel;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }
    public double getPreco() {
        return preco;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return Double.compare(preco, livro.preco) == 0 && disponivel == livro.disponivel && Objects.equals(titulo, livro.titulo) && Objects.equals(autor, livro.autor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, autor, preco, disponivel);
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", preco=" + preco +
                ", disponivel=" + disponivel +
                '}';
    }
}
