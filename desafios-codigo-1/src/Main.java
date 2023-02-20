import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        int a, b;
        double nota1, nota2;

        System.out.println("***Cálculo Produto***");
        System.out.println("Digite o primeiro número:");
        a = scanner.nextInt();
        System.out.println("Digite o segundo número:");
        b = scanner.nextInt();
        calcularProduto(a, b);

        System.out.println("\n***Cálculo Soma***");
        System.out.println("Digite o primeiro número:");
        a = scanner.nextInt();
        System.out.println("Digite o segundo número:");
        b = scanner.nextInt();
        calcularSoma(a, b);

        System.out.println("\n***Cálculo Média Notas***");
        System.out.println("Digite a primeira nota:");
        nota1 = scanner.nextDouble();
        System.out.println("Digite a segunda nota:");
        nota2 = scanner.nextDouble();
        calcularMedia(nota1, nota2);

    }

    //recebe dois números inteiros e cálcula o produto deles
    public static void calcularProduto(int a, int b){
        int produto = a * b;

        System.out.println("PRODUTO = " + produto);
    }

    //recebe dois números inteiros e cálcula a soma deles
    public static void calcularSoma(int a, int b){
        int soma = a * b;

        System.out.println("SOMA = " + soma);
    }

    //recebe duas notas e cálcula a média, sendo a nota A de peso 3.5 e a nota B de peso 7,5
    public static void calcularMedia(double nota1, double nota2){
        double media = (nota1 * 3.5 + nota2 * 7.5)/11;

        System.out.println("MEDIA = " + String.format("%.2f", media));
        System.out.println();

    }
}