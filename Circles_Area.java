package ru.vsu.cs.PoryadinAV;

import java.util.Locale;
import java.util.Scanner;

public class Circles_Area {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);

        double leg = legLengthRead();
        lengthCheck(leg);

        double area = areaCount(leg);
        areaWrite(area);
    }

    static double legLengthRead() {
        System.out.print("Enter leg length: ");
        Scanner scanner = new Scanner(System.in);

        return scanner.nextDouble();
    }

    static void lengthCheck(double leg) {
        if (leg < 0) {
            System.out.println("Invalid input format");
            System.exit(0);
        }
    }

    static double areaCount(double leg) {
        double r = (Math.sqrt(2 * leg * leg) / 2);

        return Math.PI * r * r;
    }

    static void areaWrite(double area) {
        System.out.printf("Area of a circle circumscribed around an equilateral triangle: %1$.3f", area);
    }
}
