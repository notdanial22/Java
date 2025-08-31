import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        char tempMethod;
        double temperature;
        double convertedTemperature;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Convert to Celsius or Fahrenheit?: (C or F) ");
        tempMethod = scanner.next().toUpperCase().charAt(0);

        System.out.print("Please enter temperature you want to convert: ");
        temperature = scanner.nextDouble();

        convertedTemperature = (tempMethod == 'C') ? (temperature  - 32 ) * (5.0 / 9.0)
                : ( temperature * (9.0 / 5.0) ) + 32 ;

        if (tempMethod == 'C' || tempMethod == 'F'){
            System.out.printf("%.1f converted to %c is : %.1f", temperature , tempMethod , convertedTemperature);
        }else {
            System.out.println("Please enter either C or F to convert the given temperature");
        }

        scanner.close();
    }
}
