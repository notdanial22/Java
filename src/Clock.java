import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.time.LocalTime;
import java.util.Scanner;

public class Clock implements Runnable {
    private final LocalTime time;
    private  final String alarmSound;
    Scanner scanner;

    Clock(LocalTime time, String alarmSound, Scanner scanner) {
        this.time = time;
        this.alarmSound = alarmSound;
        this.scanner = scanner;
    }

    @Override
    public void run() {
        while (LocalTime.now().isBefore(time)){
            try {
                LocalTime currentTime = LocalTime.now();
                System.out.printf("\r%02d:%02d:%02d",
                        currentTime.getHour(),
                        currentTime.getMinute(),
                        currentTime.getSecond());
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread got interrupted");
            }
        };
        System.out.println("\nWakey Wakey it's time to wake up🙄");
        playSound(alarmSound, scanner);
    }
    private void playSound(String alarmSound,Scanner scanner){
        File alarmSoundFile = new File(alarmSound);

        try(AudioInputStream audioStream = AudioSystem.getAudioInputStream(alarmSoundFile)){
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.loop(Clip.LOOP_CONTINUOUSLY);
            clip.start();
            System.out.print("Please press enter to stop alarm: ");
            scanner.nextLine();
            clip.stop();
            clip.close();

            scanner.close();
        } catch (LineUnavailableException e){
            System.out.println("Audio unavailable.");
        }catch (UnsupportedAudioFileException e) {
            System.out.println("File is not supported.");
        } catch (IOException e) {
            System.out.println("Unexpected error occurred.");
        }
    }
}
