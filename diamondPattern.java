public class diamondPattern {
    public static void main(String[] args) {
        int x=4;
        for(int i=1;i<=x;i++){
            for(int j=i;j<x;j++){
                System.out.print(" ");
            }
            for(int j=0;j<i*2-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0;i<x;i++){
            for(int j=0;j<=i;j++){
                System.out.print(" ");
            }
            for(int j=2*i;j<x*2-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
