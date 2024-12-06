import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero;

        System.out.println("Digite o numero que deseja descobrir quantos digitos possui");
        numero = sc.nextInt();

        int quantDigitos = 1;


        while (numero >= 10) {
            numero /= 10;
            quantDigitos++;

            System.out.println(quantDigitos);

        }
        sc.close();
    }
}
