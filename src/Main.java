import java.util.Scanner;

/*
Faça um programa que calcule o fatorial de um número inteiro
fornecido pelo usuário.
Ex.: 5!= 120 (5 x 4 x 3 x 2 x 1)
*/

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Fatorial: ");
        int fatorial = scan.nextInt();
        int multiplacacao = 1;

        for (int i = fatorial ; i > 0 ; i-- ){
            multiplacacao *= i;
        }
        System.out.println(fatorial + "! = " + multiplacacao);
    }
}
