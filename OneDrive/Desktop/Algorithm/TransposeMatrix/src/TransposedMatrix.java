import java.util.Arrays;

public class TransposedMatrix {
    public int[][] transposeMatrix(int[][] integers){

        int[][] transposed = new int[integers[0].length][integers.length];
        for(int row = 0; row < integers.length; row++){

            for(int column = 0; column < integers[row].length; column++){

                transposed[column][row] = integers[row][column];
            }
        }
        System.out.println(Arrays.deepToString(transposed));
        return transposed;
    }
}
