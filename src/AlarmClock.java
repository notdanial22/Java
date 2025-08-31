import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class AlarmClock {
    public static void main(String[] args){
        Scanner scanner =  new Scanner(System.in);
        LocalTime time = null;
        String alarmSoundPath = "src\\Wakey.wav";

        while (time == null){
            try{
                System.out.print("Please enter the time for alarm(HH:MM:SS): ");
                String inputTime = scanner.nextLine();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
                time = LocalTime.parse(inputTime, formatter);
            }
            catch (DateTimeParseException e){
                System.out.println("Please enter in given format");
            }
        }


         Clock clock = new Clock(time,alarmSoundPath, scanner);
        Thread alarmThread = new Thread(clock);
        alarmThread.start();


    }
}
