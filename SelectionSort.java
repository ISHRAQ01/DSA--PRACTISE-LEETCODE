import java.util.Arrays;

public class SelectionSort {
    
    public static void Sort(int [] a){
        for(int i=0;i<a.length-1;i++){
            int  minPos=i;
            for(int j=i+1;j<a.length;j++){
                if(a[minPos] > a[j]){
                    minPos=j;
                }
            }
            int temp=a[minPos];
            a[minPos]=a[i];
            a[i]=temp;
        }
    }
    public static void Printarr(int[] a){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int[] array={2,4,5,3,1};
        Sort(array);
        Printarr(array);
        int[] array2={2,1,3,4,5};
        Sort(array2);
        Printarr(array2);
        int[] array3={2,3,1,4,5};
        Arrays.sort(array3);
        Printarr(array3);

    }
}
