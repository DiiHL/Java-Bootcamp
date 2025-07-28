package dominio;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Members {
    private final Queue<String> emails = new ArrayBlockingQueue<>(10);
    private boolean open = true;

    public boolean isOpen() {
        return open;
    }

    public int listEmail() {
        synchronized (emails) {
            return emails.size();
        }
    }

    public void addEmail(String email) {
        synchronized (this.emails) {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " adicionou email na lista.");
            this.emails.add(email);
            this.emails.notifyAll();
        }
    }

    public String retirarEmail() {
        System.out.println(Thread.currentThread().getName() + " verificando se tem emails.");
        synchronized (this.emails) {
            while (listEmail() == 0) {
                if (!open) return null;
                System.out.println(Thread.currentThread().getName() + " Não tem email disponível na lista, entrando em modo de espera");
                try {
                    this.emails.wait();//modo de espera
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            return this.emails.poll();//exclui e retorna, o primeiro da queue (fila);
        }
    }

    public void fechar() {
        this.open = false;
        synchronized (this.emails) {
            System.out.println(Thread.currentThread().getName() + " Notificando todo mundo que não estamos mais recebendo email");

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
