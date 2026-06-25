import java.util.*;

public class DuplicateNo {

    public static boolean isDuplicate(int[] n){
        Map<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<n.length;i++){
            if(map.containsKey(n[i])){
                return true;
            }
            map.put(n[i],i);
        }
        return false;
    }

    public static void main(String[] args){
        int[] nums={1,2,3,4,4,5};
        System.out.println(isDuplicate(nums));

    }
}
