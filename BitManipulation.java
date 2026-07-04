import java.util.Scanner;


public class BitManipulation{
    public static int getIthBit(int n,int i){
    int bitMask=1<<i;
    if((n & bitMask)==0){
        return 0;
    }
    else
        return 1;
    }

    public static int setIthBit(int n, int i){
        int bitMask=1<<i;
        return n | bitMask;
    }

    public static int clearIthBit(int n,int i){
        int bitMask=~(1<<i);
        return n & bitMask;
    }

    public static boolean  powerOfTwo(int n){
        return (n&(n-1))==0;
    }
    public static void main(String[] args){
        int bit=1;
        Scanner sc= new Scanner(System.in);
        System.out.println("ENTER THE NUMBER");
        int n= sc.nextInt();
        if((n & bit)==0)
            System.out.println("NUMBER IS EVEN");
        else
            System.out.println("NUMBER IS ODD");

        System.out.println(getIthBit(10, 2));
        System.out.println(setIthBit(10,2));
        System.out.println(clearIthBit(10, 1));
        System.out.println(powerOfTwo(4));
    }
}