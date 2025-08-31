import java.util.Random;
import java.util.Scanner;

public class NumberGuessing {
    public static void main(String[] args){
        int number;
        int guesses = 0;
        int guess;

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        number = random.nextInt(1,101);
        System.out.println("Please guess a number between 1 and 100.");
         do {
            guesses++;
            System.out.print("Enter a number: ");
            guess = scanner.nextInt();
            if(guess > number){
                System.out.println("Too high . Try again.");
            } else if (guess < number) {
                System.out.println("Too low. Try again.");
            }else {
                System.out.printf("You found correct answer in %d guesses.",guesses);
            }

         } while (number != guess);


         scanner.close();
    }
}
