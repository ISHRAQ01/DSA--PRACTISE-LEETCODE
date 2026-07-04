public class FastExponention {
    
    public static int fastExponention(int n,int i){
        int ans=1;
        while(i>0){
            if((i&1)!=0){
                ans=ans*n;
            }
            n=n*n;
            i=i>>1;
        }
        return i;
    }
    public static void main(String[] args){
        int n=3,i=5;
        System.out.println(fastExponention(n,i));
    }
}
