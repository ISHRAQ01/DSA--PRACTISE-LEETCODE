public class DiagonalSum{

    // public static int sumDiagonal(int[][] matrix){
    //     int sum=0;
    //     for(int i=0;i<matrix.length;i++){
    //         for(int j=0;j<matrix.length;j++){
    //             //pd
    //             if(i==j)
    //                 sum+=matrix[i][j];
    //             //sd
    //             if(i!=matrix.length-i-1){
    //             if(i+j==matrix.length-1)
    //                 sum+=matrix[i][j];
    //         }
    //         }
    //     }
    //     return sum;
    // }
    public static int sumDiagonal(int[][] matrix){
        int sum=0;
        for(int i=0;i<matrix.length;i++){
            //pd
            sum+=matrix[i][i];
            //sd
            if(i!=matrix.length-i-1)
                sum+=matrix[i][matrix.length-i-1];
        }
        return sum;
    }
    public static void main(String[] args){
        int[][] matrix={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
        int[][] matrix2={{0,1,2},
                         {3,4,5},
                         {6,7,8}};
        System.out.println("Sum of diagonal is: "+sumDiagonal(matrix));
        System.out.println("Sum of diagonal is: "+sumDiagonal(matrix2));
    }
}