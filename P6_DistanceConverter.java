import java.util.Scanner;

public class P6_DistanceConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select conversion direction:");
        System.out.println("1. Kilometers to Miles");
        System.out.println("2. Miles to Kilometers");

        int choice = scanner.nextInt();

        if (choice == 1) {
           
            System.out.println("Enter distance in kilometers:");
            double kilometers = scanner.nextDouble();
            double miles = convertKilometersToMiles(kilometers);
            System.out.println(kilometers + " kilometers is equal to " + miles + " miles.");
        } else if (choice == 2) {
        
            System.out.println("Enter distance in miles:");
            double miles = scanner.nextDouble();
            double kilometers = convertMilesToKilometers(miles);
            System.out.println(miles + " miles is equal to " + kilometers + " kilometers.");
        } else {
            System.out.println("Invalid choice. Please select 1 or 2.");
        }

        scanner.close();
    }

    private static double convertKilometersToMiles(double kilometers) {
       
        return kilometers * 0.621371;
    }

    private static double convertMilesToKilometers(double miles) {
        
        return miles * 1.60934;
    }
}
