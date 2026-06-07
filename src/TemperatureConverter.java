import java.util.Scanner;

public class TemperatureConverter {

    public static double convertTemperature(double temperature, String unit) {
        if (unit.equalsIgnoreCase("C")) {
            return ((temperature * (9.0 / 5.0)) + 32.0);
        }
        else if (unit.equalsIgnoreCase("F")) {
            return ((temperature - 32.0) * (5.0 / 9.0));
        }
        return 0.0;
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String input = "";

        System.out.print("Enter a temperature value (or type 'stop' to quit): ");
        input = scnr.nextLine();

        while (!input.equalsIgnoreCase("stop")) {
            
        }
    }

}
