import java.util.Scanner;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{
    @Override
    public void ligar() {
        System.out.println("Realizando Ligação");
    }

    @Override
    public void atender() {
        System.out.println("Ligação Atendida");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Reproduzindo Correio de Voz");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Página Carregada");
    }

    @Override
    public void adicionarAba() {
        System.out.println("Nova Aba Aberta");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("A pagina foi atualizada");
    }

    @Override
    public void pausar() {
        System.out.println("Musica Pausada");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando Musica");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Musica Selecionada");
    }
}
