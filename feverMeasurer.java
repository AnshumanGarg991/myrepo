
import java.util.Scanner;

public class feverMeasurer {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double temp=sc.nextDouble();
            if(temp>100)
            System.out.println("You have a fever.");
        else{
            System.out.println("You don't have a fever.");
        }
        
    }}
}
