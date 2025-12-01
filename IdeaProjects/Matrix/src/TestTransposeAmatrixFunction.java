import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;
public class TestTransposeAmatrixFunction {
    @Test
    public void TestTransposeAmatrixFunction() {
        TransposeAmatrixFunction transposeAmatrixFunction = new TransposeAmatrixFunction();
        int[][] matrix = {{2,3,3,3},{3,4,5,5},{2,3,5,6}};
        int[][] result = TransposeAmatrixFunction.transposeMatrix(matrix);
        assertEquals(3, result[0].length);
    }

    @Test
    public void TestTransposeAmatrixFunctionConvertsToString() {
        TransposeAmatrixFunction transposeAmatrixFunction = new TransposeAmatrixFunction();
        int[][] matrix = {{2,3,3,3},{3,4,5,5}};
        String stringMatrix = transposeAmatrixFunction.transposeMatrixToString(matrix);
        assertEquals(stringMatrix,Arrays.deepToString(matrix));
    }

}
