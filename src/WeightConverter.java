import java.util.Scanner;

public class WeightConverter {
    public static void main(String[] args) {
        int number;
        double weightInLbs;
        double weightInKgs;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Weight conversion program.");
        System.out.println("1: to convert lbs to kgs.");
        System.out.println("2: to convert kgs to lbs.");

        System.out.print("Enter an option: ");
        number = scanner.nextInt();

        if (number == 1) {
            System.out.print("Please enter weight in lbs: ");
            weightInLbs = scanner.nextDouble();

            weightInKgs = weightInLbs / 2.205;
            System.out.printf("Weight in kgs will be: %.2f", weightInKgs);
        }else if(number == 2) {
            System.out.print("Please enter weight in kgs: ");
            weightInKgs = scanner.nextDouble();

            weightInLbs = weightInKgs * 2.205;
            System.out.printf("Weight in lbs will be: %.2f", weightInLbs);
        } else {
            System.out.println("Please choose one of the two options.");
        }

        scanner.close();
    }
}
