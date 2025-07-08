import java.util.List;

public class Main {

    static GerenciadorUsuarios gerenciar = new GerenciadorUsuarios();

    public static void main(String[] args) {
        List<String> usuario = List.of(
                "João, 15,joao@gmail.com",
                "Jordan, 24,jordan@email.com.br",
                "Kleber, 16, kleber.email@teste.com",
                "Bruno, 27, bruno@email.com.br",
                "João, 32, joao@email.com",
                "Maria, maria@email.com",
                "Carlos, 27,carlos@errado"
        );

        gerenciar.carregarUsuarios(usuario);
        gerenciar.exibirUsuarios();
        System.out.println("--------------------");

        gerenciar.exibirUsuariosMaiores18();
        System.out.println("--------------------");

        gerenciar.atualizarEmail("Bruno", "zenen@gmail.com");
        gerenciar.exibirUsuarios();
    }
}