public class PeakElement2d {
    public static void findValidPeak(int[][] mat) {
        int row = mat.length;
        int cols = mat[0].length;
        for(int i=0;i<row;i++){
            for (int j = 0; j < cols; j++) {
                boolean isPeak = true;
                //Left
                if (j > 0 && mat[i][j] < mat[i][j - 1])
                    isPeak = false;
                //Right
                if (j < cols - 1 && mat[i][j] < mat[i][j + 1])
                    isPeak = false;
                //Top
                if (i > 0 && mat[i][j] < mat[i - 1][j])
                    isPeak = false;
                //Down
                if (i < row - 1 && mat[i][j] < mat[i + 1][j])
                    isPeak = false;
                if(isPeak)
                System.out.println("Peak found at : (" + i + "," + j + ")"+ " = " + mat[i][j]);
            }
        }
        
    }
    public static void main(String[] args) {
        int[][] mat = {
                {10,20,15},
                {21,13,14},
                {7,16,32}
        };
        findValidPeak(mat);
    }
}
