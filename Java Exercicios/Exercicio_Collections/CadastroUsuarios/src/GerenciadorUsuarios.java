import java.util.ArrayList;
import java.util.List;

public class GerenciadorUsuarios {
    List<Usuario> usuarios = new ArrayList<>();

    public void carregarUsuarios(List<String> dados){
        String regex = "^([a-zA-Z0-9._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+$";
        for (String dado : dados) {
            String[] registro = dado.split(",");
            if (registro.length != 3){
                System.out.println("Formato invalido: "+dado);
                continue;
            }

            String nome = registro[0].trim();

            int idade = Integer.parseInt(registro[1].trim());
            if (registro[2].trim().matches(regex)) {
                String email = registro[2];
                usuarios.add(new Usuario(nome, idade, email));
                System.out.println("Usuario cadastrado com sucesso: " + nome);
            } else {
                System.out.println("Email invalido: " + registro[2]);
            }
        }
    }

    public void exibirUsuarios(){
        usuarios.forEach(System.out::println);
    }

    public void exibirUsuariosMaiores18(){
        usuarios.stream()
                .filter(usuario -> usuario.getIdade() >= 18)
                .forEach(System.out::println);
    }

    public void atualizarEmail(String nome, String emailnovo){

        for (Usuario usuario : usuarios) {
            if (usuario.getNome().equalsIgnoreCase(nome)){
                usuario.setEmail(emailnovo);
                return;
            }
        }

        System.out.println("Usuario não encontrado");
    }
}