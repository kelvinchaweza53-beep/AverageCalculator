import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Getting input fromthe user
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        System.out.print("Enter third number: ");
        double num3 = sc.nextDouble();

        System.out.print("Enter fourth number: ");
        double num4 = sc.nextDouble();

        // calculating the average
        double average = (num1 + num2 + num3 + num4)/4;

        // displaying the result
        System.out.println("The average of the four numbers is: " + average);
    }
}
