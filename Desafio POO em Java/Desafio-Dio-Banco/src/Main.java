public class Main {
    public static void main(String[] args) {
        Cliente Diego = new Cliente();
        Diego.setNome("Diego");

        Conta cc = new ContaCorrente(Diego);
        
        cc.depositar(500);
        cc.imprimirExtrato();
        Conta poupanca = new ContaPoupanca(Diego);
        cc.transferir(100, poupanca);

        poupanca.imprimirExtrato();
        cc.imprimirExtrato();
    }
}
