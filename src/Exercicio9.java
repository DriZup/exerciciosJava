import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a binary number:");
        String binary = sc.nextLine();

        int decimal = 0;

        for (int i = 0; i < binary.length(); i++){
            if (binary.charAt(i) == '1') {
                decimal += Math.pow(2, binary.length() - 1 - i);
            }
        }
        System.out.println(decimal);
        sc.close();
    }
}

