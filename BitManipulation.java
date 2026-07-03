import java.util.Scanner;

public class BitManipulation{
    public static void main(String[] args){
        int bit=1;
        Scanner sc= new Scanner(System.in);
        System.out.println("ENTER THE NUMBER");
        int n= sc.nextInt();
        if((n & bit)==0)
            System.out.println("NUMBER IS EVEN");
        else
            System.out.println("NUMBER IS ODD");
    }
}