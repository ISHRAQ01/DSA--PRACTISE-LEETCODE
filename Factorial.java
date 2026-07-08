
public class Factorial {

    public static int fact(int n){
        if(n==0){
            return 1;
        }
        else
            return(n*(fact(n-1)));
    }
    public static void main(String[] args){ 
        int n=10;
        System.out.println("The factorial of a "+n+" is: "+fact(n));
    }
}
