import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int x=sc.nextInt();
            int z=1;
            for(int i=0;i<x;i++){
                if(z==1){
                    z=0;}
                    else{
                        z=1;
                    }
                for(int j=0;j<=i;j++){
                    System.out.print(z+" ");
                    if(z==1){
                        z=0;}
                        else{
                            z=1;
                        }
                }
                System.out.println();
            }
        }
    }
}
