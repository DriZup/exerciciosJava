import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a binary number:");
        String binary = sc.nextLine();

        char[] vetor = binary.toCharArray();

        int decimal = 0;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == '1') {
                decimal += Math.pow(2, vetor.length - 1 - i);
            }
        }

        System.out.println("Decimal value: " + decimal);

        sc.close();
    }
}

