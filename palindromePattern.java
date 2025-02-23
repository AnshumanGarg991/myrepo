public class palindromePattern {
    public static void main(String[] args){
        int x=5;
        for(int i=1;i<=x;i++){
            for(int j=i;j<x;j++){
                System.out.print(" ");
            }
            for(int j=i;j>0;j--){
                System.out.print(j);
            }
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
