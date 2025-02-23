public class palindromeCheck {
    public static void main(String[] args) {
        int x=909,rev=0;
        int m=x;
        while(m>0){
            rev=rev*10+m%10;
            m=m/10;
        }
        if(x==rev){
            System.out.println("pelindrome.");
        }
        else{
            System.out.println("Not a pelindrome.");
        }
    }
}
