import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransposedMatrixTest {
    @Test
    void transpose2x3MatrixTo3x2Test(){
        TransposedMatrix tm = new TransposedMatrix();
        int[][] input = {{2,3,5}, {1,6,9}};
        tm.transposeMatrix(input);
    }

    @Test
    void transpose2x2MatrixTo2x2Test(){
        TransposedMatrix tm = new TransposedMatrix();
        int[][] input = {{2,3}, {1,4}};
        tm.transposeMatrix(input);
    }
}