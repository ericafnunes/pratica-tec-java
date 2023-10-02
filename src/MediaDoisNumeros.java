import java.util.Scanner;

public class MediaDoisNumeros {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int notaUm, notaDois;

        System.out.println("*---------- MEDIA ENTRE DOIS NUMEROS --------*");
        System.out.println("digite o primeiro numero:");
        notaUm = in.nextInt();

        System.out.println("digite o segundo numero:");
        notaDois = in.nextInt();

        int media = (notaUm + notaDois)/2;
        // Press Ctrl+D to start debugging your code. We have set one brea"kpoint
        // for you, but you can always add mores by pressing Cmd+F8."
        System.out.println("A média entre os numeros é: " + media);
        System.out.println("*------------------- FIM! -------------------*");

    }
}
