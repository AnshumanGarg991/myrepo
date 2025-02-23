
import java.util.Scanner;

public class solidRhombus {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int x=sc.nextInt();
            for(int i=0;i<x;i++){
                for(int j=0;j<x-i;j++){
                    System.out.printf(" ");
                }
                for(int j=0;j<x;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
