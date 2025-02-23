import java.util.Scanner;

public class SumofEvenAndOdd {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int oddSum = 0;
            int evenSum = 0;
            System.out.println("Enter the numbers to be entered into the set:");
            int y=sc.nextInt();
            int set;
            for(int i=0;i<y;i++){
                set=sc.nextInt();
                if(set%2==0)
                    evenSum=evenSum+set;
                else{
                    oddSum+=set;
                }
            }
            System.out.println("sum of even numbers in the set are="+evenSum);
            System.out.println("sum of even numbers in the set are="+oddSum);
        }
    }
}
