
import java.util.Scanner;

public class invertedHalfPyramid {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int x=sc.nextInt();
            for(int i=0;i<x;i++){
                for(int y=x;y>i;y--){
                    System.out.print(y);
                }
                System.out.println();
            }
        }
    }
}
