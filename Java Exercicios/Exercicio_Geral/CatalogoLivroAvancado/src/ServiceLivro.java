import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class ServiceLivro {

    public static void alugarLivro(List<Livro> livros, String name) {
        isLivroDisponivel(livros);
        ArrayList<Livro> livroAlugados = new ArrayList<>();

        System.out.println("------------------------------------");
        List<Livro> listDisponivel = livros.stream()
                .filter(livro -> livro.getTitulo().equalsIgnoreCase(name))
                .findFirst().stream().toList();

        if (!listDisponivel.isEmpty()) {
            for (Livro livro : listDisponivel) {
                if (livro.isDisponivel()) {
                    livroAlugados.add(livro);
                    livro.setDisponivel(false);
                    System.out.println("Livro alugado com sucesso, " + livroAlugados);
                    return;
                }
            }
            System.out.println("Livro ja alugado");
        } else {
            System.out.println("Livro não encontrado");
        }
    }

    public static void isLivroDisponivel(List<Livro> livro) {
        livro.stream().filter(Livro::isDisponivel).forEach(livro1 -> System.out.printf("Livros disponiveis: %s \n", livro1.getTitulo()));
    }

    public static long contarLivrosDisponiveis(List<Livro> livros) {
        return livros.stream().filter(Livro::isDisponivel).count();
    }

    public static double mediaDePrecoDosLivros(List<Livro> livros) {
        return livros.stream().mapToDouble(Livro::getPreco).average().orElse(0.0);
    }

    public static void filtrarPrecoMaior60(List<Livro> livros) {
        livros.stream().filter(livro -> livro.getPreco() > 60)
                .sorted(Comparator.comparing(Livro::getTitulo))
                .forEach(System.out::println);
    }

    public static Optional<Livro> procurarLivroPorTitulo(List<Livro> livroList, String tittle) {
        return livroList.stream().filter(l -> l.getTitulo().equalsIgnoreCase(tittle)).findFirst();

    }
}
