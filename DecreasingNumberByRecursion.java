public class DecreasingNumberByRecursion{
    public static void printDec(int n){
        if(n==0){
            System.out.println(n+" ");
            return;
        }
        System.out.print(n+" ");
        printDec(n-1);
    }
    public static void main(String[] args){
        int n=10;
        printDec(n);
        IncreasingOrder num=new IncreasingOrder();
        num.printInc(n);
    }
}


class IncreasingOrder{
    public static void printInc(int n){
        if(n==0){
            System.out.print(n+" ");
            return;
        }
        else{
            printInc(n-1);
            System.out.print(n+" ");
        }
    }
}