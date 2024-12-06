import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int base, expoente;

        System.out.println("enter the base");
        base = sc.nextInt();
        System.out.println("enter the expoente");
        expoente = sc.nextInt();

        int result = 1;

        for (int i = 1; i <= expoente; i++) {
            result *= base;
        }
        System.out.println(result);
    }
}