import java.util.Scanner;

public class TilingProblem {

    public static int ways(int n){
        if(n==0 || n==1){
            return 1;
        }
        //vertical
        int fnm1= ways(n-1);
        //horizontal
        int fnm2=ways(n-2);
        //ways
        return fnm1+fnm2;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number n: ");
        int n=sc.nextInt();
        System.out.println(ways(n));
        sc.close();
    }
}
