import java.util.Scanner;

public class FatorialNumero {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("*---------------- FATORIAL ------------------*");
        System.out.println("Digite um número: ");


        int numero = inputScanner.nextInt();

        int fatorial = 1;
        for (int i = numero; i > 1; i--){
            fatorial = fatorial*i;
        }
        System.out.println("O fatorial do numero digitado é: " + fatorial);
        System.out.println("*------------------- FIM! -------------------*");
    }
}
