class SpiralMatrix{

    public static void printSpiral(int[][] matrix){
        int startRow=0,startCol=0;
        int endRow=matrix[0].length-1,endCol=matrix.length-1;
        while(startRow<=endRow && startCol<=endCol){
            //top
            for(int i=startRow;i<=endRow;i++){
                System.out.print(matrix[startCol][i]+" ");
            }
            //right
            for(int j=startCol+1;j<=endCol;j++){
                System.out.print(matrix[j][endRow]+" ");
            }
            //bottom
            for(int i=endRow-1;i>=startRow;i--){
                if(startCol==endCol){
                    break;
                }
                System.out.print(matrix[endCol][i]+" ");
            }
            //left
            for(int j=endCol-1;j>startCol;j--){
                if(startRow==endRow){
                    break;
                }
                System.out.print(matrix[j][startRow]+" ");
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
        System.out.println();
    }
    public static void main(String[] args){
        int[][] matrix={{1},
                        {2},
                        {3},
                        {4},
                        {5}};
        printSpiral(matrix);
    }
}