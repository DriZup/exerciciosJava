import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero;
        System.out.println("Digite um numero: ");
        numero = sc.nextInt();

        int soma = 0;

        for(int i = 1; i <= numero; i++){
            soma += i;
            System.out.println(soma);

            sc.close();
        }
    }
}
