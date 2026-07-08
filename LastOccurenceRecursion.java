public class LastOccurenceRecursion {
    
    public static int lastOccurenceIndex(int[] arr,int i,int target){
        if(i==arr.length){
            return -1;
        }
        int isFound= lastOccurenceIndex(arr, i+1, target);
        if(isFound==-1 && arr[i]==target){
            return i;
        }
        return isFound;

    }
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,5};
        int target=5;
        System.out.println(lastOccurenceIndex(arr,0,target));
    }
}
