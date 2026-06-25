public class BubbleSort {
    public static void Sort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int swap = 0;
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    swap++;
                }
            }
            if (swap == 0) {
                System.out.println("Array is already sorted or sorting complete");
                break;
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        Sort(array);
        
        int[] array2 = {5, 4, 3, 2, 1};
        Sort(array2);
        
        int[] array3 = {3, 1, 4, 2, 5};
        Sort(array3);
    }
}