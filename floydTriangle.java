
import java.util.Scanner;

public class floydTriangle {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int x=sc.nextInt(),z=1;
            for(int i=0;i<x;i++){
                for(int y=0;y<=i;y++){
                    System.out.print(z+" ");
                    z++;
                }System.out.println();
            }
        }
    }
}
