import java.util.Scanner;

class Adder {
    private double number1;
    private double number2;

    public Adder(double num1, double num2) {
        number1 = num1;
        number2 = num2;
    }

    public double add() {
        return number1 + number2;
    }
}

public class P16_AddTwoNumbersByClass {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        double num1 = scanner.nextDouble();

        System.out.println("Enter the second number:");
        double num2 = scanner.nextDouble();

        Adder adder = new Adder(num1, num2);

        double sum = adder.add();

        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);

        scanner.close();
    }
}
