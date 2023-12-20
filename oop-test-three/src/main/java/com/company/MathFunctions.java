package com.company;

public class MathFunctions {
    static double PI;
    static double E;

    static double calculateCircleRadius(double radius) {
        return PI * radius * radius;
    }

    static double calculateDegree(double p, double n) {
        return Math.pow(p, n);
    }

    static double calculateTriangleAreaWithHeron(double a, double b, double c) {
        double s = (a + b + c) / 3;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

}
