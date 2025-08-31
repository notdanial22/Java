import java.util.Scanner;

public class Main {
    public static void  main (String[] args) {
//        a comment
        /*
        this
        is a
        multiline comment
         */
//        System.out.println("i like java");
//        System.out.println("it's very good");

//       Accepting user inputs:

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String name  = scanner.nextLine();    /* if we use next() instead of next line we
                                                will just get characters before any white spaces */

        System.out.print("Please enter your age: ");
        int age = scanner.nextInt(); /* to get integers will cause errors if we enter a double value */

        System.out.print("Please enter your gap: ");
        double gpa = scanner.nextDouble();

        System.out.print("Are you learning?(true/false) : ");
        boolean isLearning = scanner.nextBoolean();

        System.out.println("Your name is " + name);
        System.out.println("Your age is " + age);
        System.out.println("Your gpa is " + gpa);
        if (isLearning){
            System.out.println("You should take rest for a while.");
        }else {
            System.out.println("You should work hard!");
        }

        /* A common issue if you are using scanner right after asking a user input for integer
        *  it will cause issue cause when we click enter after entering integer it add a \n and the nextLine() thinks
        *  this is the input for the string in order to avoid it use scanner.nextLine() do not assign it to anything
        *  it will resolve the issue.   */


        scanner.close();
    }
}
