package model;

import java.util.Scanner;

public class Algorithm {

    private Scanner scanner;

    public Algorithm(Scanner scanner) {
        this.scanner = scanner;
    }

    public Float check() {
        try {
            String input = scanner.nextLine();
            Float number = Float.parseFloat(input);
            return number;
        } catch (NumberFormatException ex) {
            System.out.println("Please input a number");
            return null;
        }
    }

    public void calculateSuperlativeEquation() {
        System.out.print("Enter A: ");
        Float a = null;
        Float b = null;
        while (a == null) {
            a = check();
        }
        System.out.print("Enter B: ");
        while (b == null) {
            b = check();
        }

        // Calculate the solution x
        Float x = -b / a;
        System.out.println("Solution x = " + x);

        // Check odd, even, square
        checkOddEvenSquare(a, b);
    }

    public void calculateQuadraticEquation() {
        System.out.print("Enter coefficient A: ");
        Float a = null;
        Float b = null;
        Float c = null;
        while (a == null) {
            a = check();
        }
        System.out.print("Enter coefficient B: ");
        while (b == null) {
            b = check();
        }
        System.out.print("Enter coefficient C: ");
        while (c == null) {
            c = check();
        }

        // Calculate the discriminant (b^2 - 4ac)
        float discriminant = b * b - 4 * a * c;

        // Check if the discriminant is non-negative (real solutions)
        if (discriminant >= 0) {
            // Calculate the two solutions using the quadratic formula
            float sqrtDiscriminant = (float) Math.sqrt(discriminant);
            float x1 = (-b + sqrtDiscriminant) / (2 * a);
            float x2 = (-b - sqrtDiscriminant) / (2 * a);
            System.out.println("Solutions x1 = " + x1 + " and x2 = " + x2);
        }

        // Check odd, even, square
        checkOddEvenSquare(a, b, c);
    }

    private void checkOddEvenSquare(Float a, Float b, Float c) {
        // Check for odd, even, and square numbers from coefficients a, b, and c
        System.out.println("Checking for odd, even, and square numbers:");
        checkAndDisplayOddEven(a);
        checkAndDisplayOddEven(b);
        checkAndDisplayOddEven(c);
        checkAndDisplaySquare(a);
        checkAndDisplaySquare(b);
        checkAndDisplaySquare(c);
    }

    private void checkOddEvenSquare(Float a, Float b) {
        // Check for odd, even, and square numbers from coefficients a and b
        System.out.println("Checking for odd, even, and square numbers:");
        checkAndDisplayOddEven(a);
        checkAndDisplayOddEven(b);
        checkAndDisplaySquare(a);
        checkAndDisplaySquare(b);
    }

    private void checkAndDisplayOddEven(Float number) {
        if (isOdd(number)) {
            System.out.println("Number is Odd: " + number);
        } else if (isEven(number)) {
            System.out.println("Number is Even: " + number);
        }
    }

    private void checkAndDisplaySquare(Float number) {
        if (isPerfectSquare(number)) {
            System.out.println("Number is Perfect Square: " + number);
        }
    }

    private boolean isOdd(Float number) {
        return number % 2 != 0;
    }

    private boolean isEven(Float number) {
        return number % 2 == 0;
    }

    private boolean isPerfectSquare(Float number) {
        double sqrt = Math.sqrt(number);
        return sqrt == Math.floor(sqrt);
    }
}
