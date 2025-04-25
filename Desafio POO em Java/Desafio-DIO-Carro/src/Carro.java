public class Carro {
    private final String modelo;
    private boolean carroLigado = false;
    private boolean pontoMorto;
    private int velocidade = 0;
    private int marcha = 0;

    public Carro(final String modelo) {
        this.modelo = modelo;
        this.carroLigado = false;
        this.pontoMorto = true;
        this.velocidade = 0;
    }

    public boolean getCarroLigado() {
        return carroLigado;
    }

    public void setCarroLigado(boolean carroLigado) {
        this.carroLigado = carroLigado;
    }

    public boolean isPontoMorto() {
        return pontoMorto;
    }

    public void setPontoMorto(boolean pontoMorto) {
        this.pontoMorto = pontoMorto;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getMarcha() {
        return marcha;
    }

    public void setMarcha(int marcha) {
        this.marcha = marcha;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "modelo='" + modelo + '\'' +
                ", carroLigado=" + carroLigado +
                ", pontoMorto=" + pontoMorto +
                ", velocidade=" + velocidade +
                ", marcha=" + marcha +
                '}';
    }
}
