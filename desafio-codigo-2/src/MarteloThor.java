import java.util.Scanner;

public class MarteloThor {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int quantidadeTeste = scanner.nextInt();
        String nome;
        int N;

        for (int i = 0; i < quantidadeTeste; i++) {
            nome = scanner.next();
            N = scanner.nextInt();
            if (nome.equals("Thor")) System.out.println("Y"); //Como regra de negocio o martelo só será levantado pelo Thor
            else System.out.println("N");
        }
    }
}
