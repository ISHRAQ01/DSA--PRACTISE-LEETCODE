public class UnderstandingBitMask{

    public static int getIthBit(int n,int i){
        int bitMask=1<<i;
        return ((n & bitMask)==0?0:1);
    }
    public static int setIthBit(int n,int i){
        int bitMask=1<<i;
        return (n | bitMask);
    }
    public static int clearIthBit(int n,int i){
        int bitMask=~(1<<i);
        return (n & bitMask);
    }
    public static int updateIthBit(int n,int i, int newBit){
        return (newBit==0?clearIthBit(n, i):setIthBit(n, i));
    }
    public static int clearIthBits(int n,int i){
        int bitMask=(~0)<<i;
        return (n & bitMask);
    }
    public static int clearRangeIthBits(int n,int i,int j){
        int a= (~0)<<(j+1);
        int b= (1<<i)-1;
        int bitMask=a|b;
        return (n & bitMask);

    }
    public static void main(String[] args){
        int n=10,i=2,j=4;
        System.out.println(getIthBit(n,i));
        System.out.println(setIthBit(n,i));
        System.out.println(clearIthBit(n,i));
        System.out.println(updateIthBit(n,i,1));
        System.out.println(clearIthBits(n,i));
        System.out.println(clearRangeIthBits(n, i, j));
    }
}