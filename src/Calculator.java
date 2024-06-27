import java.util.LinkedList;
import java.util.List;

public class Calculator {


    public double add(double num1, double num2) {
        return num1 + num2;
    }


    public double sub(double num1, double num2) {
        return num1 - num2;
    }


    public double mult(double num1, double num2) {
        return num1 * num2;
    }


    public double divide(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return num1 / num2;
    }


    public List<Double> returnRoots(double a, double b, double c) {
        List<Double> roots = new LinkedList<>();
        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            roots.add((-b + Math.sqrt(discriminant)) / (2 * a));
            roots.add((-b - Math.sqrt(discriminant)) / (2 * a));
        } else if (discriminant == 0) {
            roots.add(-b / (2 * a));
        }
        // No roots if discriminant < 0

        return roots;
    }

    // Method to return the remainder when num1 is divided by num2
    public double returnRemainder(double num1, double num2) {
        return num1 % num2;
    }

    // Method to check if a number is prime
    public boolean checkPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Main method to test the Calculator class
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Test add method
        System.out.println("Add: " + calculator.add(5.5, 4.5));

        // Test sub method
        System.out.println("Subtract: " + calculator.sub(5.5, 4.5));

        // Test mult method
        System.out.println("Multiply: " + calculator.mult(5.5, 4.5));

        // Test divide method
        try {
            System.out.println("Divide: " + calculator.divide(5.5, 4.5));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }


        System.out.println("Roots of equation 2x^2 + 4x + 2: " + calculator.returnRoots(2, 4, 2));
        System.out.println("Roots of equation 1x^2 - 3x + 2: " + calculator.returnRoots(1, -3, 2));
        System.out.println("Remainder of 5.5 / 4.5: " + calculator.returnRemainder(5.5, 4.5));
        System.out.println("Is 11 prime?: " + calculator.checkPrime(11));
        System.out.println("Is 15 prime?: " + calculator.checkPrime(15));
    }
}
