import java.util.Collections;
import java.util.Scanner;

public class Main {

    private static final Scanner sc1 = new Scanner(System.in);
    private static final CatalogoManga catalogo = new CatalogoManga();

    public static void main(String[] args) {
        int opcao;

        do {
            System.out.println("1. Adicionar manga");
            System.out.println("2. Ver catalogo manga");
            System.out.println("3. Remover manga");
            System.out.println("4. Ordenar manga");
            System.out.println("0. Sair");
            System.out.println("-----------------------------");
            opcao = sc1.nextInt();

            switch (opcao) {
                case 1 -> adicionarManga();
                case 2 -> catalogo.exibirManga();
                case 3 -> removerManga();
                case 4 -> catalogo.ordenarPorTitulo();
            }
        } while (opcao != 0);
    }

    private static void adicionarManga() {
        sc1.nextLine();
        System.out.println("Digite o titulo:");
        String titulo = sc1.nextLine();
        System.out.println("Digite o valor:");
        double preco = sc1.nextDouble();
        catalogo.adicionarManga(titulo, preco);
    }

    private static void removerManga() {
        System.out.println("Digite o titulo do manga");
        String titulo = sc1.nextLine();
        sc1.nextLine();
        catalogo.removerManga(titulo);
    }
}
