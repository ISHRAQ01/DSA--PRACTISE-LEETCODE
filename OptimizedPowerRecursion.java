public class OptimizedPowerRecursion {

    public static int optimizedPower(int n, int pow){
        if(pow==0){
            return 1;
        }
        if(pow%2!=0){
            return (n*(optimizedPower(n, pow/2)*optimizedPower(n, pow/2)));
        }
        else
            return (optimizedPower(n, pow/2)*optimizedPower(n, pow/2));
    }
    public static void main(String[] args){
        int n=3,pow=2;
        System.out.println(optimizedPower(n,pow));
    }
}
