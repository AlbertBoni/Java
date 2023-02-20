import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        String [] candidatos = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO","MONICA","FABRICIO","MIRELA","DANIELA","JORGE"};
        String [] selecionados = new String[5];

        selecionados = selecionarCandidatos(candidatos);

        imprimirSelecionados(selecionados);

        for(String candidato : selecionados)
            entrandoEmContato(candidato);
    }

    static void entrandoEmContato(String candidato){
        int tentativas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do{
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando)
                tentativas++;
            else
                System.out.println("Contato realizado com sucesso");
        }while (continuarTentando && tentativas <3);

        if (atendeu)
            System.out.println("Conseguimos contato com " + candidato + " na " + tentativas + "tentativa(s)");
        else
            System.out.println("Não conseguimos contato com o candidato " + candidato + "no número máximo de tentativas");
    }

    static boolean atender(){
        return new Random().nextInt(3)==1;
    }

    static String [] selecionarCandidatos(String candidatos[]){

        String [] candidatosSelecionados = new String[5];

        int quantidadeSelecionados= 0;
        int candidatoAtual =0 ;
        double salarioBase = 2000.0;

        while (quantidadeSelecionados < 5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();
            System.out.println("Nome: " + candidato + " Salario Pretendido: " + salarioPretendido);
            if (salarioPretendido <= salarioBase){
                candidatosSelecionados[quantidadeSelecionados] = candidato;
                System.out.println("Candidado selecionado");
                quantidadeSelecionados++;
            }else {
                System.out.println("Candidado NÃO selecionado");
            }
            candidatoAtual++;
        }
        return candidatosSelecionados;
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void imprimirSelecionados(String selecionados[]){
        for(String candidato : selecionados){
            System.out.println(candidato);
        }
    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;

        if (salarioBase > salarioPretendido){
            System.out.println("Ligar para o candidato");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para o candidato com contra proposta");
        } else {
            System.out.println("Aguardando demais candidatos");
        }
    }
}
