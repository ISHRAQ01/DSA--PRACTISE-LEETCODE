public class FastExponention {
    
    public static Integer fastExponention(int n,int i){
        Integer ans=1;
        while(i>0){
            if((i&1)!=0){
                ans=ans*n;
            }
            n=n*n;
            i=i>>1;
        }
        return ans;
    }
    public static void main(String[] args){
        int n=3,i=15;
        System.out.println(fastExponention(n,i));
    }
}
