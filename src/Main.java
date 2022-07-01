import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Crie uma lista e adicione 7 notas
*/
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Double> notas = new ArrayList<Double>();

        double nota = 0.0;

        System.out.println("Quantas notas vais informar?");
        int quantidadeNotas = scan.nextInt();

        int count = 0;
        while (count < quantidadeNotas) {
            System.out.println("Digite a nota");
            nota = scan.nextDouble();

            if (nota < 0 || nota > 10) {
                System.out.println("Nota inválida");
                break;
            }
            notas.add(nota);
        }

    }

}
