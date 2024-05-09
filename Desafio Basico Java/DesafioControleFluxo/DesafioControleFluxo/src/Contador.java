import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner sc1 = new Scanner(System.in);

        System.out.println("Digite o primeiro parametro");
        int parametroUm = sc1.nextInt();
        
        System.out.println("Digite o segundo parametro");
        int parametroDois = sc1.nextInt();

        try {

            ParametrosInvalidosException.contar(parametroUm, parametroDois);

        } catch (Exception e) {

            System.out.println("O segundo parametro deve ser maior que o primeiro parametro !");
        }
    }
}
