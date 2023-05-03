import java.util.Arrays;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int matriz [][] = new int[n][n];
        int soma = 0;
        int aux = 1;

        for(int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = aux++;
            }
        }

        for(int i = 0; i < n; i++){
            soma += matriz[i][i];
        }
        System.out.print(soma);
    }
}
