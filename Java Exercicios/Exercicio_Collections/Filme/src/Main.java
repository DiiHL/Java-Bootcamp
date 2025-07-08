import com.services.CatalogoFilme;

public class Main {
    public static void main(String[] args) {
        CatalogoFilme catalogo = new CatalogoFilme();

        catalogo.adicionarFilme("Matrix", "Wachowski", 1999, 9.2);
        catalogo.adicionarFilme("A Origem", "Nolan", 2010, 8.8);
        catalogo.adicionarFilme("Avatar", "Cameron", 2009, 7.9);
        catalogo.adicionarFilme("Avatar", "Cameron", 2009, 7.9);


    }
}