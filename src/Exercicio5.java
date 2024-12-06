import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number;

        System.out.println("enter the number");
        number = sc.nextInt();

        int numeroInvertido = 0;

        while (number > 0) {
            numeroInvertido *= 10;
            numeroInvertido += (number % 10);
            number /= 10;
        }

        System.out.println(numeroInvertido);

    }
}
