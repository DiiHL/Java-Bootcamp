import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ListaDeConvidados {
    private final Set<Convidado> convidadosSet = new HashSet<>();

    public void adicionarConvidado(String name, String cpf) {
        Convidado usuario = new Convidado(name, cpf);
        if (convidadosSet.add(usuario)) {
            System.out.printf("Usuario adicionado com sucesso: %s\n", usuario.getName());
        } else {
            System.out.println("Usuario ja existente");
        }
    }

    public void removerConvidado(String cpf) {
        if (convidadosSet.isEmpty()) {
            System.out.println("A lista esta vazia");
            return;
        }
        Iterator<Convidado> convidadoIterator = convidadosSet.iterator();
        while (convidadoIterator.hasNext()) {
            Convidado convidado = convidadoIterator.next();
            if (convidado.getCpf().trim().equalsIgnoreCase(cpf)) {
                convidadoIterator.remove();
                System.out.printf("Convidado: %s removido com sucesso\n", convidado.getName());
                return;
            }
        }
        System.out.println("Usuário não encontrado");
    }

    public void listarConvidados() {
        convidadosSet.forEach(System.out::println);
    }

    public void quantosConvidados(){
        System.out.printf("Total: %s de convidados\n" ,convidadosSet.size());
    }
}