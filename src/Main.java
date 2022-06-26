import java.util.Scanner;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quantidadeNumeros;
        int numero;
        int quantidadePares = 0, quantidadeImpares = 0;

        System.out.println("Quantos números, vc quer calcular?");
        quantidadeNumeros = sc.nextInt();

        int count = 0;
        do {
            System.out.println("Digite o número");
            numero = sc.nextInt();

            if (numero % 2 == 0) quantidadePares++;
            else quantidadeImpares++;

            count ++;
        } while (count < quantidadeNumeros);

        System.out.println("Quantidade de Pares " + quantidadePares);
        System.out.println("Quantidade Impares " + quantidadeImpares);
    }
}
