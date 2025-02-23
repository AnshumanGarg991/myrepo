
import java.util.Scanner;

public class hollowRectangle {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int l=sc.nextInt();
            int b=sc.nextInt();
            for (int i = 0 ;i < b ;i++){
                if(i==0 || i==b-1){
              for(int j=0;j<l;j++){
                System.out.print("0");
              }}
              else{
              System.out.print("0");
              for(int k=0;k<l-2;k++){
                System.out.print(" ");
              }
              System.out.print("0");
            }
        System.out.println();}
        }

    }
}
