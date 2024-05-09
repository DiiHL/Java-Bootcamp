import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc1 = new Scanner(System.in);

        System.out.println("Olá, informe seu nome: ");
        String nomeClient = sc1.nextLine();

        System.out.println("Porfavor, informe o nome da sua agência que deseja criar: ");
        String nomeAgencia = sc1.nextLine();

        System.out.println("Informe o número da Agência: ");
        int numeroAgencia = sc1.nextInt();

        System.out.println("Informe seu saldo: ");
        double saldo = sc1.nextDouble();

        System.out.println("Olá " + nomeClient + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + nomeAgencia + ", conta " + numeroAgencia + " e seu saldo " + saldo + " já está disponível para saque. ");

    }
}
