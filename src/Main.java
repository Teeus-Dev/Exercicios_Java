import java.util.Scanner;

/*
Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido
e continue pedindo até que o usuário informe um valor válido.
*/

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nota;

        System.out.println("Nota entre 0 e 10");
        nota = sc.nextInt();

        while (nota > 10 || nota < 0 ) {
            System.out.println("Valor inválido, favor informar uma nota válida entre 0 e 10");
            nota = sc.nextInt();
        }

        System.out.println("Continua...");
    }
}
