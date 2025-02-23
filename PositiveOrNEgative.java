
import java.util.Scanner;

public class PositiveOrNEgative {
    // Question1:WriteaJavaprogramtogetanumberfromtheuserandprintwhetheritispositive or negative.
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            int x=sc.nextInt();
            if(x>0){
                System.out.println("Positive.");
            }
            else if(x==0){
                System.out.println("Zero.");
            }
            else{
                System.out.println("Negative");
            }
        }

}    
}
