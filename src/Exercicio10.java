import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;

        System.out.println("Enter a number  : ");
        n = sc.nextInt();

        int[] fibonacci = new int[n + 1];

        if (n > 0) fibonacci[0] = 0;
        if (n > 1) fibonacci[1] = 1;

        for (int i = 2; i <= n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        System.out.println("Serie de Fibonacci:");
        for (int i = 0; i < n; i++) {
            System.out.println(fibonacci[i]);
            if (i < n - 1) {
                System.out.print(", ");
            }
        }
        sc.close();
    }
}
