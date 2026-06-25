public class InsertionSort{
    public static void Sort(int[] a){
        for(int i=1;i<a.length;i++){
            int curr=a[i];
            int prev=i-1;
            while(prev>=0 && a[prev]>curr){
                a[prev+1]=a[prev];
                prev--;
            }
            a[prev+1]=curr;
        }
    }
    public static void Printar(int[] a){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" " );
        }
        System.out.println();
    }
    public static void main(String[] args){
        int[] array={2,3,1,4,5};
        Sort(array);
        Printar(array);
    }
}