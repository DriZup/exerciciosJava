import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number;

        int multiplier;

        System.out.println("Enter a number: ");
        number = sc.nextInt();
        System.out.println("Enter multiplier: ");
        multiplier = sc.nextInt();

        int quantidadeMultiplier = multiplier / number;

        for (int i = 1; i <= quantidadeMultiplier; i++) {
            System.out.println(i * number);
            if (i < quantidadeMultiplier) {
                System.out.println(", ");
            }
            sc.close();
        }
    }
}
