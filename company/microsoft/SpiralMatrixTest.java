import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class SpiralMatrixTest {
    @Test
    public void testSpiralOrder() {
    SpiralMatrix sm = new SpiralMatrix();
    // Test case 1
    int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    List<Integer> result1 = sm.spiralOrder(matrix1);
    assert result1.equals(Arrays.asList(1, 2, 3, 6, 9, 8, 7, 4, 5));
    // Test case 2
    int[][] matrix2 = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
    List<Integer> result2 = sm.spiralOrder(matrix2);
    assert result2.equals(Arrays.asList(1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7));
    // Test case 3
    int[][] matrix3 = {};
    List<Integer> result3 = sm.spiralOrder(matrix3);
    assert result3.equals(new ArrayList<Integer>());
    }
}
