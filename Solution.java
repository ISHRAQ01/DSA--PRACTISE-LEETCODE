import java.util.Arrays;

class Solution {
    public static  int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        // Result array to store coordinates
        int[][] result = new int[rows * cols][2];
        
        // Directions: East, South, West, North
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        
        // Start position
        int r = rStart;
        int c = cStart;
        int dir = 0;  // Start facing East
        int step = 1; // Step length starts at 1
        int count = 0;
        
        // Add starting position
        result[count++] = new int[]{r, c};
        
        while (count < rows * cols) {
            // Move in current direction for 'step' steps
            for (int i = 0; i < step; i++) {
                r += directions[dir][0];
                c += directions[dir][1];
                
                // Check if current position is inside grid
                if (r >= 0 && r < rows && c >= 0 && c < cols) {
                    result[count++] = new int[]{r, c};
                }
            }
            
            // Change direction (E→S→W→N→E...)
            dir = (dir + 1) % 4;
            
            // After every 2 directions, increase step length
            if (dir == 0 || dir == 2) {
                step++;
            }
        }
        
        return result;
    }

    public static void main(String[] args){
        System.out.println(Arrays.toString(spiralMatrixIII(3,3,0,4)));
    }
}