package singleton;

public class Singleton {

    private static Singleton instancia = new Singleton();

    private Singleton() {
        super();
    }

    public static Singleton getInstancia() {
        return instancia;
    }
}