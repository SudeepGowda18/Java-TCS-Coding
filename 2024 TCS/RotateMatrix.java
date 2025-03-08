import java.util.*;

public class RotateMatrix {
    public static void findRotateMatrix(int[][] matrix) {
        int n = matrix.length;
        int[][] rotatedMatrix = new int[n][n];
        for(int i=0;i<n;i++){
            for (int j = 0; j < n; j++) {
                rotatedMatrix[n-j-1][i] = matrix[i][j];
            }
        }
        for (int[] row : rotatedMatrix) {
            System.out.println(Arrays.toString(row));
        }
    }
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        findRotateMatrix(matrix);
    }
}
