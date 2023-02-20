package App;

public class Telegram extends ServicoMensagemInstantanea{
    @Override
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo App.Telegram");
    }

    @Override
    public void receberMensagem() {
        validarConectadoInternet();
        System.out.println("Recebendo mensagem pelo App.Telegram");
    }
}
