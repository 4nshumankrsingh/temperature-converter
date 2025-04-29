import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        double temp;
        double newTemp;
        int choice;
        System.out.println("Temperature Conversion Program");
        System.out.println("Option 1: Celsius to Fahrenheit");
        System.out.println("Option 2: Fahrenheit to Celsius");
        
        System.out.print("What's your option ?: ");
        choice = scanner.nextInt();
        
        if(choice == 1) {
            System.out.print("Enter the temperature in Celsius: ");
            temp = scanner.nextDouble();
            newTemp = (temp * 1.8) + 32;
            System.out.printf("%.2f°C = %.2f°F", temp, newTemp);
        }
        else if(choice == 2) {
            System.out.print("Enter the temperature in Fahrenheit: ");
            temp = scanner.nextDouble();
            newTemp = (temp - 32) * 5 / 9;
            System.out.printf("%.2f°F = %.2f°C", temp, newTemp);
        }
        else {
            System.out.println("Enter a valid option");
        }
       scanner.close();
        
    }
}