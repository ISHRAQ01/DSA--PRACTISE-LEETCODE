
import java.util.*;

class TwoSum {

    public static int[] twoSum(int[] a,int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<a.length;i++){
            int check=target-a[i];
            if(map.containsKey(check)){
                return new int[]{map.get(check),i};
            }
            map.put(a[i],i);
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] arr={2,6,7,15};
        System.out.println(Arrays.toString(twoSum(arr,9)));
    }
}
