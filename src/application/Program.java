package application;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        System.out.println("Nome do aluno: ");
        student.name = sc.nextLine();

        System.out.println("Primeira nota do aluno: ");
        student.point1 = sc.nextDouble();

        System.out.println("Segunda nota do aluno: ");
        student.point2 = sc.nextDouble();

        System.out.println("Terceira nota do aluno: ");
        student.point3 = sc.nextDouble();

        System.out.printf("FINAL GRADE: %.2f%n", student.finalGrade());

        if (student.finalGrade() >= 60.0) {
            System.out.printf("PASS");
        } else {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f", student.missingPoint());
        }
        sc.close();;
    }
}
