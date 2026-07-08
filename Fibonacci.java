public class Fibonacci {
    // 0,1 ,1,2,,3,5
    public static void main(String[] args){
        int n=5;
        int first=0,second=1,next=0;
        for(int i=0;i<=n;i++){
            if(i<=1){
                next=i;
            }
            else{
                next=first+second;
                first=second;
                second=next;
            }
            System.out.print(next+" ");
        }
    }
}
