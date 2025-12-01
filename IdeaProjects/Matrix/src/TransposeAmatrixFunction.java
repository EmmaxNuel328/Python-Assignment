import java.util.Arrays;
public class TransposeAmatrixFunction {
    public static int[][] transposeMatrix(int[][] matrix) {
        int row = matrix.length;
        int column = matrix[0].length;
        int[][] result = new int[column][row];
        return result;
    }

    public String transposeMatrixToString(int[][] matrix) {
        return Arrays.deepToString(matrix);
    }
}
