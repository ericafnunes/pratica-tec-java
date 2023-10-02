import java.util.Scanner;

public class Contagem {
    public static void main(String[] args){
        int count;
        Scanner in = new Scanner(System.in);
        System.out.println("*------ CONTAGEM REGRESSIVA -------*: ");
        System.out.println("Digite um numero: ");
        count = in.nextInt();

        for( int i = count; i >= 1; i--){
            System.out.println(i);
        }
        in.close();
    }
}
