
import java.util.Scanner;

public class multiTable {
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            int c=sc.nextInt();
            for (int i=1;i<=10;i++){
                System.out.println(c+" * "+i+" = "+c*i);
            }
        }
        
    }
}
