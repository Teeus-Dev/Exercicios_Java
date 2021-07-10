package application;

import entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();

        System.out.println("Enter Rectangle width");
        rectangle.width = sc.nextDouble();
        System.out.println("Enter Rectangle height");
        rectangle.height = sc.nextDouble();

        System.out.print(rectangle);

        sc.close();
    }
}
