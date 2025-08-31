import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) throws FileNotFoundException {



        String filePath = "src\\word.txt";
        ArrayList<String> wordsList = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            String CurrentWord;
            while ((CurrentWord = reader.readLine()) != null){
                wordsList.add(CurrentWord.trim());
            };

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        catch (IOException e) {
          System.out.println("Unexpected error occurred");
        }

        Random random  = new Random();

        Scanner scanner  =  new Scanner(System.in);

        String word = wordsList.get(random.nextInt(wordsList.size())).toLowerCase();
        int wrongGuess = 0;
        ArrayList<Character> worldList = new ArrayList<>();

        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("Welcome to hangman game🥳😄");
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^");

        for(int i=0; i< word.length(); i++){
            worldList.add('_');
        }

        System.out.println();

        while (wrongGuess < 6) {
            System.out.print("Word: ");
            for (Character character : worldList){
                System.out.print(character + " ");
            }
            System.out.println();

            System.out.println(hangManArt(wrongGuess));

          char guess;
          System.out.print("Enter alphabet: ");
          guess  = scanner.next().toLowerCase().charAt(0);
            if (word.indexOf(guess) >= 0){
                for (int i=0; i< word.length(); i++){
                    if (word.charAt(i) == guess){
                       worldList.set(i , guess);
                    }
                }
                System.out.println("Correct Guess🎆");
                if (!worldList.contains('_')){
                    System.out.println("You won😃");
                    System.out.println("The word was " + word);
                    break;
                }
            }
            else {
                System.out.println("Wrong Guess🙄");
                wrongGuess++;
            }
        }

        if (wrongGuess >= 6) {
            System.out.println(hangManArt(wrongGuess));
            System.out.println("You lost the game💀");
            System.out.println("The correct word was: " + word);

        }
        scanner.close();
    }
    static String hangManArt(int wrong){
        return switch (wrong){
            case 1 -> """
              +---+
                |
            
            
            ==========""";
            case 2 -> """
              +---+
                |
                O
            
            
            ==========""";
            case 3 -> """
              +---+
                |
                O
                |
            
            
            
            ==========""";
            case 4 -> """
              +---+
                |
                O
               /|
            
            
            
            ==========""";
            case 5 -> """
              +---+
                |
                O
               /|\\
            
            
            ==========""";
            case 6 -> """
              +---+
                |
                O
               /|\\
               / \\
            
            
            ==========""";
            default -> """
              +---+
            
            
            
            ==========""";
        };
    }
}
