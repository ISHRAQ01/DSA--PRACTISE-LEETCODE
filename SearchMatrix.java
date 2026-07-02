public class SearchMatrix {

    public static boolean  search(int[][] matrix,int key){
        int row=0, col=matrix[0].length-1;
        while(row< matrix.length && col>=0){
            if(key==matrix[row][col]){
                System.out.println("KEY "+key+" FOUND AT INDEX: ("+row+","+col+")");
                return true;
            }
            else if(key< matrix[row][col]){
                col--;
            }
            else {
                row++;
            }
        }
        System.out.println("KEY "+key+" IS NOT FOUND IN THE MATRIX");
        return false;
    }
    public static void main(String[] args){
        int[][] matrix= {{10,20,30,40}};
        int key=40;
        search(matrix, key);
    }
}
