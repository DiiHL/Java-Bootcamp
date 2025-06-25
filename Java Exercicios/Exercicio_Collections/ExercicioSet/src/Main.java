import java.util.Scanner;

public class Main {
    private static final Scanner sc1 = new Scanner(System.in);
    private static final ListaDeConvidados convite = new ListaDeConvidados();

    public static void main(String[] args) {
        int option;

        do {
            System.out.println("1. Adicionar convidado");
            System.out.println("2. Remover convidado");
            System.out.println("3. Listar convidados convidados");
            System.out.println("4. Verificar quantidade de convidados");
            System.out.println("5. Sair");
            option = sc1.nextInt();
            sc1.nextLine();

            switch (option){
                case 1 -> adicionarConvidado();
                case 2 -> removerConvidado();
                case 3 -> convite.listarConvidados();
                case 4 -> convite.quantosConvidados();
            }
        }while (option != 5);
        System.out.println("Ate a proxima");

    }

    public static void adicionarConvidado(){
        System.out.println("Digite o nome");
        String nome = sc1.nextLine();
        System.out.println("Digite seu cpf");
        String cpf = sc1.nextLine();

        convite.adicionarConvidado(nome, cpf);
    }

    public static void removerConvidado(){
        System.out.println("Digite o Cpf para remoção");
        String cpfRemocao = sc1.nextLine();
        convite.removerConvidado(cpfRemocao);
    }
}