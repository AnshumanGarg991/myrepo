public class Solution{
    public static void main(String[] args) {
        int ly=0;
        for(int i=1;i<=2015;i++){
            if((i%100!=0 && i%4==0)|| i%400==0){
                ly+=1;
            }
        }
        System.out.println(ly);
        System.out.println((int)(2015%4));
        System.out.println((int)(2015%400));
        System.out.println((int)(2015/4)+(int)(2015/400)-(int)(2015/100));
        System.out.println(2015/4+2015/400-2015/100);
    }
}