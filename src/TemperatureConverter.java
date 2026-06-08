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

        while (!input.equalsIgnoreCase("stop")) {
            System.out.print("Enter a temperature value (or type 'stop' to quit): ");
            input = scnr.nextLine();

            if (!input.equalsIgnoreCase("stop")) {
                Scanner scan = new Scanner(input);

                if (scan.hasNextDouble()) {
                    double temperature = scan.nextDouble();
                    System.out.print("Enter the unit (C or F): ");

                    String unit = scnr.nextLine();

                    if (unit.equalsIgnoreCase("C") || unit.equalsIgnoreCase("F")) {
                        double convertedTemp = convertTemperature(temperature, unit);

                        if (unit.equalsIgnoreCase("C")) {
                            System.out.println(temperature + "°C is equal to " + convertedTemp + "°F");
                        } else {
                            System.out.println(temperature + "°F is equal to " + convertedTemp + "°C");
                        }
                    } else {
                        System.out.println("Error message displayed, reprompt shown");
                    }
                }
                else {
                    System.out.println("Error message displayed, reprompt shown");
                }
                scan.close();
            }
        }

        System.out.println("Program exits gracefully");
        scnr.close();
    }
}
