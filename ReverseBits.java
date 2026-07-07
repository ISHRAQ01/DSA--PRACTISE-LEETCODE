public class ReverseBits {
    
    public static int reverseBit(int n){
        int result=0;
        for(int i=0;i<32;i++){
            int lastBit=(n & 1);
            result=(result<<1) | lastBit;
            n=n>>1;
        }
        return result;
    }
    public static void main(String[] args){
        int n=43261596;
        System.out.println(reverseBit(n));
    }
}
