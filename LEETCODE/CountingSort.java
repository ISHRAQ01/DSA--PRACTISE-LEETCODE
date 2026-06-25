
public class CountingSort {
    public static void Sort(int[] a){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            largest=Math.max(largest,a[i]);
        }
        int[] count=new int[largest+1];
        for(int i=0;i<a.length;i++){
            count[a[i]]++;
        }
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                a[j]=i;
                j++;
                count[i]--;
            }
        }
    }
    public static void Printar(int[] a){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int[] array={5,4,3,2,1,0,1,1,1,1};
        Sort(array);
        Printar(array);
    }
}
