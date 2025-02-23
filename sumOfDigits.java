public class sumOfDigits {
    public static void main(String[] args) {
        System.out.println(digitSum(567));
    }
    public static int digitSum(int x) {
        if(x>0)
        return x%10+digitSum(x/10);
        else 
        return 0;
    }
}
