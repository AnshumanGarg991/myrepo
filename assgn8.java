package myrepo;
import java.util.Scanner;

public class assgn8{
    public static double avg(double x,double y,double z){
        return (x+y+z)/3;
    }
    public static void main(String[] args) {
        double num1;
        double num2;
        double num3;
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter the first number:");
            num1 = scan.nextDouble();
            System.out.println("Enter the first number:");
            num2 = scan.nextDouble();
            System.out.println("Enter the first number:");
            num3 = scan.nextDouble();
        }
        System.out.println("The average of entered number is :"+avg(num1,num2,num3));
    }
}

