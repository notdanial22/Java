import java.util.Scanner;

public class Quiz {
    public static void main(String[] args){

        String[] questions = {
                "What is orange?",
                "What is 1 + 1?",
                "What is a bank?",
                "What is a key?",
                "What is a bat?"
        };

        String[][] options = {
                {"1. Fruit", "2. Color", "3. Idk 🙄"},
                {"1. 2", "2. 11", "3. Idk 🙄"},
                {"1. Place for money", "2. River side", "3. Idk 🙄"},
                {"1. Opens a lock", "2. Musical note", "3. Idk 🙄"},
                {"1. Animal", "2. Sports equipment", "3. Idk 🙄"}
        };

        int[] answers = {1,3,1,1,2};

        int score = 0;
        int guess;
        Scanner scanner = new Scanner(System.in);


        for (int i=0; i < questions.length; i++){
            System.out.println(questions[i]);

            for (String option : options[i]){
                System.out.println(option);
            }

            System.out.print("Enter answer(Number): ");
            guess = scanner.nextInt();

            if(guess == answers[i]){
                score++;
                System.out.println("Correct answer🥳");
                System.out.println();
            }else{
                System.out.println("Wrong answer🥺");
                System.out.println();
            }
        }

        if(score == 5){
            System.out.println("Wow you got all answers correct🎆");
        }else{
            System.out.println("You got " + score + " correct out of 5 . come on they were really easy 😑");
        }

        scanner.close();
    }
}
