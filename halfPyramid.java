
import java.util.Scanner;

public class halfPyramid {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int x=sc.nextInt();
            for (int i = 0; i < x; i++) {
                for (int j = i; j < x-1; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j <i+1 ; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
