package com.netcracker.courses.triangles;
import java.util.Random;
public class IsoscelesTriangle extends Triangle {
    private static String style = "red";

    public IsoscelesTriangle(int sideA, int sideB, int nameOfTriangle, String style) {
        super(sideA, sideB, nameOfTriangle);

    }

    public double square() {
        double square = getSideB() / 4 * Math.sqrt(4 * Math.pow(getSideA(), 2) - Math.pow(getSideB(), 2));
        return square;
    }

    @Override
    public String toString() {
        return "IsoscelesTriangle № " + getNameOfTriangle() + " [SideA=" + getSideA() + ", SideB=" + getSideB() + ", SideC=" + getSideB() + ", style=" + style + "]";
    }

    public static IsoscelesTriangle createTreangle() {
        int a = 0, b = 0;
        Random rand = new Random();
        int name = rand.nextInt(100);
        for (int i = 0; i < 2; i++) {
            Random r = new Random();
            if (i == 0) a = r.nextInt(31);
            else if (i == 1) b = r.nextInt(31);
        }
        IsoscelesTriangle figure = new IsoscelesTriangle(a, b, name, style);
        return figure;
    }
}