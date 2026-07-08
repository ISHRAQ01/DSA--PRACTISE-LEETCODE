public class FirstoccurenceRecursion {

    public static int findTarget(int[] arr,int i,int target){
        if(arr[i]==target){
            return i;
        }
        if(i==arr.length-1){
            return -1;
        }
        else{
            return findTarget(arr, i+1, target);
        }
    }
    public static void main(String[] args) {
     int[] arr={8,3,6,9,5,10,2,5,3};
     int target=51;
     System.out.println(findTarget(arr,0,target));   
    }
}
