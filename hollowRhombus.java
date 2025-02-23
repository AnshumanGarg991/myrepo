import java.util.Scanner;

public class hollowRhombus {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int x=sc.nextInt();
            for(int i=0;i<x;i++){
                for(int j=i;j<x-1;j++){
                    System.out.print(" ");
                }
                if(i==0 || i==x-1){
                for(int j=0;j<x;j++){
                    System.out.print("*");
                }}
                else{
                    System.out.print("*");
                    for(int j=0;j<x-2;j++){
                        System.out.print(" ");
                    }
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
