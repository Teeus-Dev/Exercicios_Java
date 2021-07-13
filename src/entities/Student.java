package entities;

public class Student {

    public String name;
    public double point1;
    public double point2;
    public double point3;

    public double finalGrade() {
        return point1 + point2 + point3;

    }

    public double missingPoint() {
        if (finalGrade() > 60.00) {
            return 0.0;
        } else {
            return 60.00 - finalGrade();
        }
    }

}

