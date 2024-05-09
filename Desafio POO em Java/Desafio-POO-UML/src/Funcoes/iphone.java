package Funcoes;

import java.util.Scanner;

public class iphone implements aparelhoTelefonico, navegadorInternet, reprodutorMusical {
    Scanner sc1 = new Scanner(System.in);
    
    private String cor;
    private String modelo;

    public iphone (String cor, String modelo){
        this.cor = cor;
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }


    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    @Override
    public void tocar() {
        System.out.println("Tocando música");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música");
    }

    private void SelecionandoMusica() {
        System.out.println("Selecionando música");
    }

    @Override
    public void escolherMusica() {
        SelecionandoMusica();
        System.out.println("Selecione a musica que deseja: ");

        try {
            String selecionarMusica = sc1.nextLine();

            checarMusica(selecionarMusica);

        } catch (Exception e) {
            System.out.println("Musica não encontrada" + e);
        }

    }

    private void checarMusica(String selecionarMusica) {
        if (selecionarMusica == null && selecionarMusica.length() == 0) {
            System.out.println(" Nenhuma musica foi selecionada ");
        } else {
            System.out.println("A musica selecionada foi: " + selecionarMusica);
        }
    }

    @Override
    public void ligar() {
        System.out.println("Selecione pra quem ligar: ");
        try {
            String selecionarContato = sc1.nextLine();

            checarLigacao(selecionarContato);

        } catch (Exception e) {
            System.out.println(" Nenhum contato foi encontrado " + e);
        }

    }
    private void checarLigacao(String checarLigacao) {
        if (checarLigacao == null && checarLigacao.length() == 0) {
            System.out.println(" Nenhum contato foi encontrado ");
        } else {
            System.out.println("Ligando para: " + checarLigacao);
        }
    }

    @Override
    public void atender() {
        System.out.println("Atendendo...");
    }

    @Override
    public void iniciarCorrerioVoz() {
        System.out.println("Iniciando correio de voz");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo a Pagina");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a Pagina");
    }

}
