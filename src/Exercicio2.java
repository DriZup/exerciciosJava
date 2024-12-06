import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o numero para calculo do fatorial: ");
        int numero = sc.nextInt();

        long factorial = 1;
        int i = 1;

        while (i <= numero) {
            factorial *= i;
            System.out.println(i + " x " + factorial / i + " = " + factorial);
            i++;
        }

        System.out.println("O fatorial de " + numero + " é: " + factorial);
        sc.close();
    }
}
