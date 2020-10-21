package ru.vsu.cs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Point p1 = ReadPoint1("p1");
        Point p2 = ReadPoint1("p2");
        Point p3 = ReadPoint1("p3");
        Point p4 = ReadPoint1("p4");
        System.out.print(sravnenieStoron(p1, p2, p3, p4));
    }

    private static Point ReadPoint1(String name) {

        double x = ReadDouble(name + ".x");
        double y = ReadDouble(name + ".y");
        return new Point(x, y);
    }

    public static double ReadDouble(String name) {

        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter %s: ", name);
        return scanner.nextDouble();
    }


    public static boolean sravnenieStoron (Point p1, Point p2, Point p3, Point p4)
    {
        return     (FoundDistance(p1, p2) == FoundDistance(p2, p3))
                && (FoundDistance(p2, p3) == FoundDistance(p3, p4))
                && (FoundDistance(p3, p4) == FoundDistance(p4, p1))
                && (FoundDistance(p4, p1) == FoundDistance(p1, p2))

                && (FoundDistance(p1, p3) == FoundDistance(p2, p4));


    }

    public static double FoundDistance(Point p1, Point p2)
    {
        return  Math.sqrt((p1.x - p2.x) * (p1.x - p2.x) + (p1.y - p2.y) * (p1.y - p2.y));
    }
}


