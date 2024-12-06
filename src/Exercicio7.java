import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String palavra;

        System.out.println("Enter a world: ");
        palavra = sc.nextLine();

        String palavraTrazPraFrente = "";

        for (int i = palavra.length() - 1; i >= 0; i--) {
            palavraTrazPraFrente += palavra.charAt(i);

        }

        boolean palindrono = palavraTrazPraFrente.equals(palavra);
        System.out.println("What about a palindrome? " + palindrono);
    }
}
