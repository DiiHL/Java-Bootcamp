import java.util.LinkedHashSet;
import java.util.Set;

public class Banco {

    private String nome;
    //Cria list Contas
    private Set<Conta> contas = new LinkedHashSet<>();

    public void exibirContas(){
        System.out.println(contas);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}