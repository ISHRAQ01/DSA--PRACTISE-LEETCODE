import java.util.*;

public class Fact{
    public static long factorial(int a){
        long fact=1;
        for(int i=1;i<=a;i++){
            fact*=i;
        }
        return fact;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER: ");
        int n=sc.nextInt();
        System.out.println("THE FATORIAL OF A NUMBER "+n+" IS= "+(long)factorial(n));

    }
}