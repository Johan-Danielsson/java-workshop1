package se.johan;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    // creating the main method and calling each method here

    public static void main(String[] args) {

        // creating Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // adding loop so you stay inside the program until option 5 is chosen
        while (true) {
            // creating the menu to chose option
            System.out.println("---------------------------");
            System.out.println("Welcome to Basic Calculator");
            System.out.println("1: Addition");
            System.out.println("2: Subtraction");
            System.out.println("3: Multiplication");
            System.out.println("4: Division");
            System.out.println("5: Exit the calculator");
            System.out.println("---------------------------");
            System.out.println("Please enter your option:");

            int option = 0;
            // Added try and catch to not get error if you input characters
            try {

                option = input.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Please enter a number.");
                input.next();
            }

            if (option == 1) {
                System.out.println("Enter the first number: ");
                double num1 = input.nextDouble();
                System.out.println("Enter the second number: ");
                double num2 = input.nextDouble();

                addMethod(num1, num2); // passing relevant attributes to method
            } else if (option == 2) {
                System.out.println("Enter the first number: ");
                double num1 = input.nextDouble();
                System.out.println("Enter the second number: ");
                double num2 = input.nextDouble();

                subtractMethod(num1, num2); // passing relevant attributes to method
            } else if (option == 3) {
                System.out.println("Enter the first number: ");
                double num1 = input.nextDouble();
                System.out.println("Enter the second number: ");
                double num2 = input.nextDouble();

                multiplyMethod(num1, num2); // passing relevant attributes to method
            } else if (option == 4) {
                System.out.println("Enter the first number: ");
                double num1 = input.nextDouble();
                System.out.println("Enter the second number: ");
                double num2 = input.nextDouble();

                divisionMethod(num1, num2); // passing relevant attributes to method
            } else if (option == 5) {
                System.out.println("---------------------------");
                System.out.println("Thank you for using the calculator. Good bye!");
                System.exit(0); // exit the program without
            } else {
                System.out.println("---------------------------");
                System.out.println("Please enter a correct value.");
            }


        }
    }
    //Implementing methods for operations separately

    //each method takes two parameters

    // method for addition
    public static void addMethod(double num1, double num2) {
        double answer = num1 + num2;
        System.out.println("---------------------------");
        System.out.println(num1 + "+" + num2 + "=" + answer);
    }

    // method for subtraction
    public static void subtractMethod(double num1, double num2) {
        double answer = num1 - num2;
        System.out.println("---------------------------");
        System.out.println(num1 + "-" + num2 + "=" + answer);

    }

    // method for multiplication
    public static void multiplyMethod(double num1, double num2) {
        double answer = num1 * num2;
        System.out.println("---------------------------");
        System.out.println(num1 + "*" + num2 + "=" + answer);

    }

    // method for division
    public static void divisionMethod(double num1, double num2) {
        double answer = num1 / num2;
        System.out.println("---------------------------");
        System.out.println(num1 + "/" + num2 + "=" + answer);

    }
}



