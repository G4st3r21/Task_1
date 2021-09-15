package ru.vsu.cs.PoryadinAV;

import java.util.Locale;
import java.util.Scanner;

public class Circles_Area {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите длину катета: ");
        double a = scanner.nextDouble();

        double r = (Math.sqrt(2 * a * a) / 2);
        double p = Math.PI * r * r;

        System.out.printf("Площадь окружности, описанной вокруг прямоугольного равобедренного треугольника: %1$.3f", p);
    }
}
