import Service.BibliotecaService;

public class Main {
    public static void main(String[] args) {
        BibliotecaService biblioteca = new BibliotecaService();

        biblioteca.adicionarLivro("O Hobbit", "Tolkien", 1937, 59.90);
        biblioteca.adicionarLivro("Dom Quixote", "Cervantes", 1605, 120.0);
        biblioteca.adicionarLivro("1984", "George Orwell", 1949, 80.0);
        biblioteca.adicionarLivro("O Senhor dos Anéis", "Tolkien", 1954, 150.0);
        biblioteca.adicionarLivro("1984", "George Orwell", 1949, 80.0);

        biblioteca.listarLivros();
        System.out.println("--------------------");
        biblioteca.ordenarPorAno();
        biblioteca.listarLivros();
        System.out.println("--------------------");
        biblioteca.ordenarPorPrecoDecrescente();
        biblioteca.listarLivros();
        System.out.println("--------------------");
        biblioteca.mostrarLivrosMaisCaro(100);
        System.out.println("--------------------");
        biblioteca.valorTotal();
    }
}