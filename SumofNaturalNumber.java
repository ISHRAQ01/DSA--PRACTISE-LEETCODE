public class SumofNaturalNumber {
    public static int sumNatural(int n){
        if(n==1){
            return 1;
        }
        else{
            return (n+sumNatural(n-1));
        }
    }

    public static void main(String[] args){
        int n=5;
        System.out.println("THE SUM OF N "+n+" NATURAL NUMBER IS: "+sumNatural(n));
    }
}
