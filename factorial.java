
import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int x=sc.nextInt();
            long fact = 1;
            for(int i=1;i<=x;i++){
                fact*=i;
            }
            System.out.println("Factorial ="+fact);
        }
    }
}