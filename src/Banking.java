import java.util.Scanner;

public class Banking {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        double balance = 0;
        boolean isRunning = true;
        int process;

        while(isRunning) {
            System.out.println("**************");
            System.out.println("Banking System");
            System.out.println("**************");
            System.out.print("""
                    Please enter which process you want to continue
                    1. Balance check
                    2. Deposit amount
                    3. Withdraw amount
                    4. exit
                    """);
            System.out.print("Enter process number: ");
            process = scanner.nextInt();


            switch(process) {
                case 1 -> {
                    System.out.printf("Your current balance is $%.2f .\n", balance);
                    isRunning = continuation();
                }
                case 2 -> {
                    balance += depositProcess();
                    isRunning = continuation();
                }
                case 3 -> {
                    balance = withdrawProcess(balance);
                    isRunning = continuation();
                }
                case 4 -> isRunning = false;
                default -> System.out.println("Please enter one of the given options.");
            }

        }

        System.out.println("Thank you for using our services 😁. Have a nice day.");
        scanner.close();
    }
    static boolean continuation(){
        System.out.print("Would you like to continue or do you want to exit.(1. continue 2. exit): ");
        int num = scanner.nextInt();
       return (num == 1);
    }
    static double depositProcess (){
        System.out.print("Please enter the amount you want to deposit: ");
        double amount = scanner.nextDouble();
        if (amount == 0 || amount < 0) {
            System.out.println("Please enter a positive amount to deposit. \n");
            return 0.00;
        }else {
            System.out.printf("You have deposited $%.2f. \n", amount);
            return amount;
        }
    }
    static double withdrawProcess (double balance){
        System.out.print("Please enter the amount you want to withdraw: ");
        double cashOut = scanner.nextDouble();
        if(cashOut > balance) {
            System.out.println("You can not withdraw more than your current balance. \n");
            return balance;
        } else {
            System.out.printf("You have withdrawn $%.2f. Your remaining balance is $%.2f. \n", cashOut, balance - cashOut);
            return  balance - cashOut;
        }
    }
}
