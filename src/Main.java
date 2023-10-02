import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int notaUm, notaDois;

        System.out.println("*---------- SOMA ENTRE DOIS NUMEROS --------*");
        System.out.println("digite o primeiro numero:");
        notaUm = in.nextInt();

        System.out.println("digite o segundo numero:");
        notaDois = in.nextInt();

        int soma = notaUm + notaDois;
            // Press Ctrl+D to start debugging your code. We have set one breakpoint
            // for you, but you can always add mores by pressing Cmd+F8.
        System.out.println("A soma entre os numeros é: " + soma);
        System.out.println("*------------------- FIM! -------------------*");
        }
    }