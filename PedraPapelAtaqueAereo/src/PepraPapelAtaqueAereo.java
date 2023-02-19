import java.util.Scanner;

public class PepraPapelAtaqueAereo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidadeJogos = scanner.nextInt();
        String jogador1, jogador2;

        for (int i = 0; i < quantidadeJogos; i++) {
            jogador1 = scanner.next();
            jogador2 = scanner.next();
            if (jogador1.equalsIgnoreCase("ataque") && jogador2.equalsIgnoreCase("ataque"))
                System.out.println("Aniquilacao mutua");
            else if (jogador1.equalsIgnoreCase("papel") && jogador2.equalsIgnoreCase("papel"))
                System.out.println("Ambos venceram");
            else if (jogador1.equalsIgnoreCase("ataque")) System.out.println("Jogador 1 venceu");
            else if (jogador2.equalsIgnoreCase("ataque")) System.out.println("Jogador 2 venceu");
            else if (jogador2.equalsIgnoreCase("papel")) System.out.println("Jogador 1 venceu");
            else if (jogador1.equalsIgnoreCase("papel")) System.out.println("Jogador 2 venceu");
            else System.out.println("Sem ganhador");
        }
    }
}