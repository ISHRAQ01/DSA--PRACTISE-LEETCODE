import java.util.*;

public class BinarySearch{
    public static int bin(int no,int a[]){
        int st=0 , end= a.length-1;
        for(int i=0;i<a.length;i++){
            while(st<=end){
                int mid=(st+end)/2;
                if(a[mid]==no){
                    return mid;
                }
                if(a[mid]<no){
                    st=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int marks[]={1,2,3,4,5,6,7,8,9,10};
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER TO BE SEARCH:");
        int key=sc.nextInt();
        int index=bin(key,marks);
        System.out.println("FOUND AT INDEX "+index);
    }
}