package ru.vsu.cs.PoryadinAV;

import java.util.Locale;
import java.util.Scanner;

public class Circles_Area {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);

        double leg = InputNum();

        InputCheck(leg);

        double area = Count(leg);
    }

    static double InputNum() {
        System.out.print("Enter leg length: ");
        Scanner scanner = new Scanner(System.in);

        return scanner.nextDouble();
    }

    static void InputCheck(double leg) {
        if (leg < 0) {
            System.out.println("Invalid input format");
            System.exit(0);
        }
    }

    static double Count(double leg) {
        double r = (Math.sqrt(2 * leg * leg) / 2);

        return Math.PI * r * r;
    }

    static void WriteAns(double area) {
        System.out.printf("Area of a circle circumscribed around an equilateral triangle: %1$.3f", area);
    }
}
