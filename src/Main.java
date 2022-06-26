import java.util.Scanner;

/*
Desenvolva um gerador de tabuada,
capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
O usuário deve informar de qual número ele deseja ver a tabuada.
A saída deve ser conforme o exemplo abaixo:

Tabuada de 5:
5 x 1 = 5
5 x 2 = 10
...
5 x 10 = 50
*/

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Tabuada de de qual núemro? ");
        int tabuada = sc.nextInt();

        for (int i = 0; i <= 10 ; i++){
        System.out.println("Tabuada " + tabuada + " X " + i + " = "
                + tabuada * i);
        }
    }
}
