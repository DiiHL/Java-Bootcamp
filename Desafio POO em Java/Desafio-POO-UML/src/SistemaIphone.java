import Funcoes.iphone;

public class SistemaIphone {

    public static void main(String[] args) throws Exception {
        iphone iph = new iphone("Branco" , "Iphone 1");

        System.out.println(iph.getCor());
        System.out.println(iph.getModelo() +"\n");

        iph.ligar();
        iph.atender();
        iph.escolherMusica();

    }
}
