import java.util.Scanner;

public class assgn8{
    public static double avg(double x,double y,double z){
        return (x+y+z)/3;
    }
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the first number:");
        double num1=scan.nextDouble();
        System.out.println("Enter the first number:");
        double num2=scan.nextDouble();
        System.out.println("Enter the first number:");
        double num3=scan.nextDouble();
        scan.close();
        System.out.println("The average of entered number is :"+avg(num1,num2,num3));
    }
}
