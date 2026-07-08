import java.util.Scanner;

public class PairProblemRecursion{

    public static int pairWays(int n){
        if(n==1 || n==2){
            return n;
        }
        //single choice
        int sin1=pairWays(n-1);
        //pairs
        int pai=pairWays(n-2);
        //single+pair
        int pa2=(n-1)*pai;
        //ways
        return (sin1+pa2);
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(pairWays(n));
    }
}