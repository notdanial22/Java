import javax.sound.sampled.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Music {
    public static void main(String[] args) {
        String filePath = "src\\ACELERADA.wav";

        File file = new File(filePath);

        try(Scanner scanner = new Scanner(System.in);
         AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)){

            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);

            String response = "";

            while(!response.equals("Q")) {
                System.out.println("Play : P");
                System.out.println("Stop : S");
                System.out.println("Restart : R");
                System.out.println("Quit : Q");
                System.out.print("Please enter your choice: ");
                response = scanner.next().toUpperCase();

                switch (response){
                    case "P" -> {
                        clip.start();
                        System.out.println("🥳 enjoy");
                    }
                    case "S" -> clip.stop();
                    case "R" -> clip.setMicrosecondPosition(0);
                    case "Q" -> clip.close();
                    default -> System.out.println("Invalid choice🤬");
                }

            }

        }catch (FileNotFoundException e){
            System.out.println("File not found");
        }
        catch (UnsupportedAudioFileException e){
            System.out.println("File not supported😑.");
        }
        catch (LineUnavailableException e) {
            throw new RuntimeException(e);
        }
        catch(IOException e){
            System.out.println("Unexpected error occured.😥");
        }

    }
}
