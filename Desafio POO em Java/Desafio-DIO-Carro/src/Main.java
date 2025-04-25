import java.util.Scanner;

public class Main {
    static FuncaoCarro funCarro;
    private static final Scanner sc1 = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao = 0;
        criarCarro();
        funCarro.descricao();

        do {
            System.out.println("===========================");
            System.out.println("1. Ligar carro");
            System.out.println("2. Desligar carro");
            System.out.println("3. acelerar");
            System.out.println("4. diminuir velocidade");
            System.out.println("5. virar para esquerda/direita");
            System.out.println("6. verificar velocidade");
            System.out.println("7. trocar de marcha");
            System.out.println("8. Criar novo carro");
            System.out.println("0. Sair");
            System.out.println("-----------------------------");
            opcao = sc1.nextInt();

            switch (opcao) {
                case 1 -> funCarro.ligarCarro();
                case 2 -> funCarro.desligarCarro();
                case 3 -> {
                    System.out.println("Velocidade: ");
                    int velocidade = sc1.nextInt();
                    funCarro.acelerarCarro(velocidade);
                }
                case 4 -> {
                    System.out.println("Velocidade: ");
                    int velocidade = sc1.nextInt();
                    funCarro.desacelerarCarro(velocidade);
                }
                case 5 -> {
                    System.out.println("Lado da curva");
                    String direcao = sc1.nextLine();
                    funCarro.dobrar(direcao);
                }
                case 6 -> funCarro.retornarVelocidade();
                case 7 -> {
                    funCarro.retornarMarcha();
                    int marcha = sc1.nextInt();
                    funCarro.marcha(marcha);
                }
                case 8 -> criarCarro();
            }
        } while (opcao != 0);
    }

    public static void criarCarro() {
        String name = "";
        while (name == null || name.isEmpty()) {
            System.out.println("Digite um nome: ");
            name = sc1.nextLine();
        }
        Carro carro = new Carro(name);
        funCarro = new FuncaoCarro(carro);
    }
}