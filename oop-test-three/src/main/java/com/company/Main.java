package com.company;

public class Main {
    public static void main(String[] args) {

        MathFunctions.PI = 3.14159265359;
        MathFunctions.E = 2.71828182846;


        double circleArea = MathFunctions.calculateCircleRadius(5);
        System.out.println("Circle radius = " + circleArea);

        double p = MathFunctions.calculateDegree(2, 3);
        System.out.println("raised to the power of e = " + p);

        double a = 8;
        double b = 9;
        double c = 6;
        double triangleArea = MathFunctions.calculateTriangleAreaWithHeron(a, b, c);
        System.out.println("Triangle Area = " + triangleArea);


    }
}