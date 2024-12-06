import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numPrimo;

        System.out.println("Digite um numero: ");
        numPrimo = sc.nextInt();

        boolean isPrimo = (numPrimo > 1);

        for (int i = 2; i < numPrimo && isPrimo; i++) {
            if(numPrimo % i == 0) {
                isPrimo = false;
            }
       }
        System.out.println(isPrimo ? "True" : "false");
    }

}
