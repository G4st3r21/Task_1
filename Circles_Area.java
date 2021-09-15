package ru.vsu.cs.PoryadinAV;

import java.util.Locale;
import java.util.Scanner;

public class Circles_Area {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);

        double leg = readNum();

        checkNum(leg);

        double area = count(leg);

        System.out.printf("Area of a circle circumscribed around an equilateral triangle: %1$.3f", area);
    }

    static double readNum() {
        System.out.print("Enter leg length: ");
        Scanner scanner = new Scanner(System.in);

        return scanner.nextDouble();
    }

    static void checkNum(double leg) {
        if (leg < 0) {
            System.out.println("Invalid input format");
            System.exit(0);
        }
    }

    static double count(double leg) {
        double r = (Math.sqrt(2 * leg * leg) / 2);

        return Math.PI * r * r;
    }
}
