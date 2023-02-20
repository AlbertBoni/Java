import App.FacebookMessenger;
import App.MsnMessenger;
import App.ServicoMensagemInstantanea;
import App.Telegram;

public class Terminal {
    public static void main(String[] args) {
        ServicoMensagemInstantanea smi = null;

		/*
		    NÃO SE SABE QUAL APP
		    MAS QUALQUER UM DEVERÁ ENVIAR E RECEBER MENSAGEM
		 */
        String appEscolhido="???";

        if(appEscolhido.equals("msn"))
            smi = new MsnMessenger();
        else if(appEscolhido.equals("fbm"))
            smi = new FacebookMessenger();
        else if(appEscolhido.equals("tlg"))
            smi = new Telegram();


        smi.enviarMensagem();
        smi.receberMensagem();
    }
}
