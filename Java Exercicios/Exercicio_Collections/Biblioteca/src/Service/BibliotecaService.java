package Service;

import Modelo.Book;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BibliotecaService {
    private final List<Book> listBook = new ArrayList<>();

    public void adicionarLivro(String titulo, String autor, int anoPublicacao, double preco) {
        Book newBook = new Book(titulo, autor, anoPublicacao, preco);
        if (!listBook.contains(newBook)) {
            listBook.add(newBook);
            System.out.printf("Livro adicionado %s com sucesso\n", newBook.getTitulo());
        } else {
            System.out.println("Livro ja existente");
        }
    }

    public void listarLivros() {
        for (Book book : listBook) {
            System.out.println(book);
        }
    }

    public void ordenarPorAno() {
        Collections.sort(listBook);
    }

    public void ordenarPorPrecoDecrescente() {
        listBook.sort(Comparator.comparing(Book::getPreco).reversed());
    }

    public void mostrarLivrosMaisCaro(double valor) {
        for (Book book : listBook) {
            if (book.getPreco() > valor) {
                System.out.println(book);
            }
        }
    }

    public void valorTotal() {
        double total = 0;

        for (Book book : listBook) {
            total += book.getPreco();
        }
        System.out.println("Valor total: " +total);
    }
}