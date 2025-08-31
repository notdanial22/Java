import java.util.Random;
import java.util.Scanner;

public class RockPaper {
    public static void main(String[] args){
        Scanner scanner =  new Scanner(System.in);
        Random random =  new Random();
        int totalGames;
        String[] actions = {"1. Rock" , "2. Paper" , "3. Scissors"};
        int computerGuess;
        int userGuess;
        int userWins = 0;
        int computerWins = 0;


        System.out.print("How many games you would like to play? (1-10): ");
        totalGames = scanner.nextInt();
        if(totalGames > 10 || totalGames < 0){
            totalGames = 3;
        }


        for (int i = 1; i <= totalGames ; i++){
          computerGuess = random.nextInt(1,4);
//            System.out.println(computerGuess);
          for (String action : actions){
              System.out.println(action);
          }
          do{
              System.out.print("Enter one of the above options:(1-3) ");
              userGuess = scanner.nextInt();
          } while(userGuess < 1  || userGuess > 3);

          if (userGuess == computerGuess){
              System.out.println("Its a tie. \n");
          } else if (userGuess == 1 && computerGuess == 3 || userGuess == 2 && computerGuess == 1 || userGuess == 3 && computerGuess == 2){
              System.out.println("You won🥳");
              userWins++;
          } else {
              System.out.println("Computer won 😑.Computer choice " + actions[computerGuess] );
              computerWins++;
          }
        }


        System.out.println("You won " + userWins + " out of " + totalGames + " games and computer won " + computerWins + ".");

        scanner.close();
    }
}
