import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.sound.sampled.LineUnavailableException;
import java.io.IOException;

public class TimerTest {
    private static int remainingSeconds;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a number for countdown: ");
        remainingSeconds = scanner.nextInt();

        Timer timer = new Timer();

        TimerTask countdownTask = new TimerTask() {
            @Override
            public void run() {
                if (remainingSeconds > 0) {
                    System.out.println("Time remaining: " + remainingSeconds + " seconds");
                    remainingSeconds--;
                } else {
                    // Countdown finished, play audio and stop timer
                    System.out.println("Time's up!");
                    playAudio();
                    timer.cancel();
                }
            }
        };

        // Start countdown immediately, then repeat every 1000ms (1 second)
        timer.scheduleAtFixedRate(countdownTask, 0, 1000);

        scanner.close();
    }

    private static void playAudio() {
        try {
            String filePath = "src\\LA.wav";
            File file = new File(filePath);

            if (!file.exists()) {
                System.out.println("Audio file not found: " + filePath);
                return;
            }

            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();
            long startPosition = 6 * 1_000_000;
            clip.setMicrosecondPosition(startPosition);

            // Keep the program alive while audio plays
            Thread.sleep(clip.getMicrosecondLength() / 1000);

            clip.close();
            audioStream.close();

        } catch (UnsupportedAudioFileException e) {
            System.out.println("Unsupported audio file format: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error reading audio file: " + e.getMessage());
        } catch (LineUnavailableException e) {
            System.out.println("Audio line unavailable: " + e.getMessage());
        } catch (InterruptedException e) {
            System.out.println("Audio playback interrupted: " + e.getMessage());
        }
    }
}