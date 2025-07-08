import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class CatalogoManga{
    List<Manga> mangaList = new ArrayList<>();
    private Manga manga;

    public void adicionarManga(String titulo, double preco) {
        mangaList.add(new Manga(titulo, preco));
    }


    public void removerManga(String titulo) {
        Iterator<Manga> mangaIterator = mangaList.iterator();
        if (mangaList.isEmpty()) {
            System.out.println("A lista está Vazia");
            return;
        }
        while (mangaIterator.hasNext()) {
            if (mangaIterator.next().getTitulo().equalsIgnoreCase(titulo)) {
                mangaIterator.remove();
                System.out.println("Manga removido com sucesso");
                return;
            }
        }
        System.out.println("Manga não encontrado");
    }

    public void exibirManga(){
        for (Manga manga : mangaList){
            System.out.println(manga);
        }
    }

    public void ordenarPorTitulo() {
     mangaList.sort(Comparator.comparing(Manga::getTitulo));
    }
}
