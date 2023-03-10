package dominando_ides.inttelliJ.calculadora;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int a, b;
            System.out.println("Digite o primeiro valor: ");
            a = scan.nextInt();
            System.out.println("Digite o segundo valor: ");
            b  = scan.nextInt();

            int somar = somar(a, b);
            int subtracao = subtracao(a, b);
            int multiplicacao = multiplicacao(a, b);
            double divisao = divisao(a, b);

            System.out.println("Adição " + somar);
            System.out.println("Subtração " + subtracao);
            System.out.println("Multiplicação " + multiplicacao);
            System.out.println("Divisão " + divisao);
        }
    }
    public static int somar(int a, int b){
        return a + b;
    }
    public static int subtracao(int a, int b){
        return a - b;
    }
    public static double divisao(int a, int b){
        return (double) a / b;
    }
    public static int multiplicacao(int a, int b){
        return a * b;
    }
}
