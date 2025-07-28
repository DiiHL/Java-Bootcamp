package test;

import dominio.Members;
import service.EmailDeliveryService;

import javax.swing.JOptionPane;

public class EmailDeliveryTest01 {
    public static void main(String[] args) {
        Members members = new Members();
        Thread agencia1 = new Thread(new EmailDeliveryService(members), "Agencia 1");
        Thread agencia2 = new Thread(new EmailDeliveryService(members), "Agencia 2");
        agencia1.start();
        agencia2.start();
        while (true){
            String email = JOptionPane.showInputDialog("Entre com seu email");
            if (email == null || email.isEmpty()){
                members.fechar();
                break;
            }
            members.addEmail(email);
        }
    }
}
