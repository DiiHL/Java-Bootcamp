public class FuncaoCarro {

    private String direcao;
    private final Carro carro;

    public FuncaoCarro(Carro carro) {
        this.carro = carro;
    }

    public void descricao() {
        System.out.println(carro.toString());
    }

    public void ligarCarro() {
        carro.setCarroLigado(true);
        System.out.println("Carro ligado");
    }

    public void desligarCarro() {
        if (carro.getMarcha() == 0 && carro.getVelocidade() == 0 && carro.getCarroLigado()) {
            carro.setCarroLigado(false);
            System.out.println("Carro desligado");
        } else {
            System.out.println("O carro precisa esta parado e na marcha 0");
        }
    }

    public void dobrar(String direcao) {
        if (!verificarCarroligado()) return;

        if (direcao.equalsIgnoreCase("direita")) {
            System.out.println("Virando para direita");
        } else if (direcao.equalsIgnoreCase("esquerda")) {
            System.out.println("Virando para esquerda");
        } else {
            System.out.println("Opção invalida, tente: esquerda/direita");
        }
    }

    public void acelerarCarro(int b) {
        if (!verificarCarroligado()) return;
        for (int i = carro.getVelocidade(); i <= b; i++) {
            System.out.println(i + " Km");
            carro.setVelocidade(i);

            if (carro.getVelocidade() >= 120) {
                System.out.println("Atingiu a velocidade maxima");
                break;
            }
        }
    }

    public void desacelerarCarro(int b) {
        if (!verificarCarroligado()) return;
        for (int i = carro.getVelocidade(); i <b || i > b; i--) {
            System.out.println(i + " Km");
            carro.setVelocidade(i);

            if (carro.getVelocidade() <= 0) {
                System.out.println(carro.getVelocidade() + " Km");
                break;
            }
        }
    }

    public void marcha(int marcha) {
        if (!verificarCarroligado()) return;

        if (carro.getMarcha() == 0) {
            carro.setPontoMorto(true);
        }
        switch (marcha) {
            case 1 -> {
                if (carro.getVelocidade() > 0 && carro.getVelocidade() <= 20) {
                    System.out.println("Primeira marcha");
                } else {
                    System.out.println("Velocidade tem que estar entre 1-20");
                }
            }
            case 2 -> {
                if (carro.getVelocidade() > 20 && carro.getVelocidade() <= 40) {
                    System.out.println("Segunda marcha");
                } else {
                    System.out.println("Velocidade tem que estar entre 21-40");
                }
            }
            case 3 -> {
                if (carro.getVelocidade() > 40 && carro.getVelocidade() <= 60) {
                    System.out.println("Terceira marcha");
                } else {
                    System.out.println("Velocidade tem que estar entre 41-60");
                }
            }
            case 4 -> {
                if (carro.getVelocidade() > 60 && carro.getVelocidade() <= 80) {
                    System.out.println("Quarta marcha");
                } else {
                    System.out.println("Velocidade tem que estar entre 61-80");
                }
            }
            case 5 -> {
                if (carro.getVelocidade() > 80 && carro.getVelocidade() <= 100) {
                    System.out.println("Quinta marcha");
                } else {
                    System.out.println("Velocidade tem que estar entre 81-100");
                }
            }
            case 6 -> {
                if (carro.getVelocidade() > 100 && carro.getVelocidade() <= 120) {
                    System.out.println("Sexta marcha");
                } else {
                    System.out.println("Velocidade tem que estar entre 101-120");
                }
            }
            default -> System.out.println("Quer se matar ??");
        }
    }

    public void retornarVelocidade() {
        System.out.println(carro.getVelocidade());
    }

    public void retornarMarcha() {
        System.out.println("Marcha atual: " + carro.getMarcha());
    }

    public boolean verificarCarroligado() {
        if (!carro.getCarroLigado()) {
            System.out.println("Carro esta desligado");
            return false;
        }
        return true;
    }
}