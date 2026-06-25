
public class Kandans{

    public static int Max_Sum(int[] nums){
        int max=Integer.MIN_VALUE;
        int cs=0;
        for(int i=0;i<nums.length;i++){
            cs=cs+nums[i];
            System.out.println("Current sum:"+ cs);
            if(cs<0){
                cs=0;
            }
            max=Math.max(cs,max);
        }

    return max;
    }
    public static void main(String[] args){
        int num[]={-1,-2,4,3,1,6,-4};
        System.out.println("Maximum sub array sum:"+ Max_Sum(num));
    }
}