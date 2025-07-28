package service;

import dominio.Members;

public class EmailDeliveryService implements Runnable {
    private final Members members;

    public EmailDeliveryService(Members members) { //construtor pq members é final
        this.members = members;
    }

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + " começando o envio emails...");
        while (members.isOpen() || members.listEmail() > 0) {
            try {
                String email = members.retirarEmail();
                              if (email == null) continue;
                System.out.println(threadName + " eviando email para " +email);
                Thread.sleep(2000);// espera 2seg
                System.out.println(threadName + " enviou email com sucesso para " +email);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("todos os emails foram enviado com sucesso!");
    }
}
