import java.util.Scanner;

/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/

public class Main {
    public static void main(String[] args) {

        int[] vetor = {0, -15, 50, 8, 4};

        // Mostrar os valores do vetor

        System.out.print("Vetor: ");
        int count = 0;
        while(count < (vetor.length)) {
            System.out.print(vetor[count] + " ");
            count++;
        }
        // Começa na ultima posição do vetor e vai lendo decrementalmente

        System.out.print("\nVetor: ");
        for(int i = (vetor.length - 1); i >= 0 ; i --) {
            System.out.print(vetor[i] + " ");
        }
    }
}
