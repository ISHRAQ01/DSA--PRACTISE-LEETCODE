
import java.util.Scanner;

public class MatrixArray {
   
    public static void main(String[] args){
        int[][] a=new int[3][3];
        Scanner sc= new Scanner(System.in);
        System.out.println("ENTER THE ITEMS: ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Elements of 2D-Arrat are: ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.println("a["+i+"]["+j+"]"+"is "+a[i][j]);
            }
        }
    }
}
