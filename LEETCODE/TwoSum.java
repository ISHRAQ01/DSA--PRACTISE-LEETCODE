
import java.util.*;

class TwoSum {

    public static int[] twoSum() {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(2, 0);
        map.put(7, 1);
        map.put(11, 2);
        map.put(15, 3);
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int value=entry.getKey();
            int check=9-value;
            if(map.containsKey(check)){
                return new int[]{entry.getValue(),map.get(check)};
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum()));
    }
}
