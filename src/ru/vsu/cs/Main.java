package ru.vsu.cs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Point p1 = readPoint1("p1");
        Point p2 = readPoint1("p2");
        Point p3 = readPoint1("p3");
        Point p4 = readPoint1("p4");
        System.out.print(defineSquare(p1, p2, p3, p4));
    }

    private static Point readPoint1(String name) {

        double x = readDouble(name + ".x");
        double y = readDouble(name + ".y");
        return new Point(x, y);
    }

    private static double readDouble(String name) {

        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter %s: ", name);
        return scanner.nextDouble();
    }


    private static boolean defineSquare (Point p1, Point p2, Point p3, Point p4)
    {
        return     (foundDistance(p1, p2) == foundDistance(p2, p3))
                && (foundDistance(p2, p3) == foundDistance(p3, p4))
                && (foundDistance(p3, p4) == foundDistance(p4, p1))
                && (foundDistance(p4, p1) == foundDistance(p1, p2))

                && (foundDistance(p1, p3) == foundDistance(p2, p4));
    }

    private static double foundDistance(Point p1, Point p2)
    {
        return  Math.sqrt((p1.x - p2.x) * (p1.x - p2.x) + (p1.y - p2.y) * (p1.y - p2.y));
    }
}


