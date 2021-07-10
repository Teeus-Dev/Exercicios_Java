package application;

import entities.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Favor informar os dados do Triangulo X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Favor informar os dados do Triangulo Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("O valor da area do Triangulo X eh: %.4f%n", areaX);
        System.out.printf("O valor da area do Triangulo Y eh: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("O trinagulo X é maior que o Y !!");
        } else {
            System.out.println("O trinagulo Y é maior que o X !!");
        }

        sc.close();

    }
}
