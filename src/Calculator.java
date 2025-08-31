import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        double number1;
        double number2;
        char operation;
        double result = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter on of the operations you want to perform: (+ , - , * , / , ^ or %): ");
        operation = scanner.nextLine().charAt(0);

        System.out.print("Please enter first number: ");
        number1 = scanner.nextDouble();

        System.out.print("Please enter second number: ");
        number2 = scanner.nextDouble();

        switch(operation) {
            case '+' -> {
                result = number1 + number2;
                System.out.printf("The result of addition is: %.2f", result);
            }
            case '-' -> {
                result = number1 - number2;
                System.out.printf("The result of subtraction is: %.2f", result);
            }
            case '*' -> {

                result = number1 * number2;
                System.out.printf("The result of multiplication is: %.2f", result);
            }
            case '/' -> {
                if (number2 == 0) {
                    System.out.println("Can not divide by zero");
                }else {
                    result = number1 / number2;
                    System.out.printf("The result of division is: %.2f", result);
                }
            }
            case '^' -> {
                result = Math.pow(number1 , number2);
                System.out.printf("The result of power is: %.2f", result);
            }
            case '%' -> {
                result = number1 % number2;
                System.out.printf("The result of modulus is: %.2f", result);
            }
            default -> System.out.println("Please enter one of the given operations.");
        }



        scanner.close();
    }
}
