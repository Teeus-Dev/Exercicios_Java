import java.util.Random;
import java.util.Scanner;

/*
Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9
*/
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int[][] M = new int[4][4];

        for(int linha = 0; linha < M.length; linha++) {
            for(int coluna = 0; coluna < M[linha].length; coluna++) {
                M[linha][coluna] = random.nextInt(9);
            }
        }

        // pegar a primeira linha e navega em cada elemento da linha,

        System.out.println("Matriz: ");
        for (int[] linha : M ) {
            for (int coluna : linha ) {
                System.out.print(coluna + " ");
            }
            // após terminar a primeira linha, vai pular a linha
            System.out.println();
        }


    }

}
