import java.awt.*;
import java.util.Scanner;

public class Palindromos {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Digite uma palavra para verificar: ");
        String frase = input.nextLine().toLowerCase();

        String x = "";

        char aux;

        for ( int i = frase.length()-1; i >= 0; i--){
            aux = frase.charAt(i);
            x = x + aux;
        }
        if(frase.equals(x)){
            System.out.println("É um palindromo!");
        } else{
            System.out.println("Não é um palindromo!");
        }

    }
}
