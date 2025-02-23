
import java.util.Scanner;

public class priceCalculator {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("ENter the number of items to be Purchased :");
            costCalc(scan.nextInt());
        }
    }
    public static void costCalc(int a) {
        double sum = 0,x;
        try (Scanner scan = new Scanner(System.in)) {
            for (int i = 1; i <= a; i++) {
                System.out.println("Enter the item "+i+": ");
                x=scan.nextDouble();
                sum+=x;
            }
        }
        System.out.println("THe cost of the entire product in Rupees is "+sum);
        System.out.println("The cost of products including GST in Rupees is "+sum*1.18);
        int $=24;
        System.out.println($);
    }
}
