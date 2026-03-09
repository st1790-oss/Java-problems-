import java.util.Scanner;

public class PoundsToKilograms {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // Input
            System.out.print("Enter weight in pounds: ");
            double pounds = sc.nextDouble();

            // Conversion
            double kilograms = pounds / 2.2;

            // Output
            System.out.println("The weight of the person in pound is " + pounds + " and in kg is " + kilograms);
        }
    }
}