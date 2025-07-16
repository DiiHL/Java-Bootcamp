import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    private static final List<Livro> livros = List.of(
            new Livro("Java Básico", "Ana", 49.90, true),
            new Livro("Spring Boot", "Carlos", 89.90, true),
            new Livro("Estruturas de Dados", "Beatriz", 59.90, true),
            new Livro("POO em Java", "Diego", 39.90, true)
    );
    public static void main(String[] args) {
        System.out.println(ServiceLivro.contarLivrosDisponiveis(livros));
        ServiceLivro.filtrarPrecoMaior60(livros);
        System.out.printf("%.2f\n",ServiceLivro.mediaDePrecoDosLivros(livros));

        ServiceLivro.procurarLivroPorTitulo(livros, "Estruturas de Dados");


        ServiceLivro.alugarLivro(livros, "POO em Java");
        System.out.println(ServiceLivro.contarLivrosDisponiveis(livros));
    }
}