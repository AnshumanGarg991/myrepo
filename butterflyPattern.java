
import java.util.Scanner;

public class butterflyPattern {
    public static void main(String[] args) {
        int x;
        try (Scanner sc = new Scanner(System.in)) {
            x=sc.nextInt();
        }
        for (int i = 0; i < x; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 2 * i; j < (x * 2) - 2; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < x; i++) {
            for (int j = i; j < x; j++) {
                System.out.print("*");
            }
            for (int j = i * 2; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = i; j < x; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
