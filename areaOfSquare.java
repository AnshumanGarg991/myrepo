package myrepo;
import java.util.Scanner;

public class areaOfSquare {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter the side of the square :");
            double side=scan.nextDouble();
            System.out.println("The area of the square is "+side *side+".");
        }
    }
}
