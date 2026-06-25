
public class MaxArray {

    public static void main(String args[]) {
        int sum = 0;
        int max=Integer.MIN_VALUE;
        int[] a = {1, 2, 3, 4, 5, 6};
        
        for(int i=0;i<a.length;i++){                    
            for(int j=i;j<a.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print("("+a[k]+")");
                    sum+=a[k];
                }
                System.out.println("Sum of this array="+sum);
                max=Math.max(max,sum);
                sum=0;
            }

            System.out.println("");
        }

        System.out.println("MAX SUM OF ARRAY IS ="+max);
    }
}

