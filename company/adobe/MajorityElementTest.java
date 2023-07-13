import static org.junit.Assert.assertEquals;
import java.util.concurrent.ThreadLocalRandom;
import org.junit.Test;

public class MajorityElementTest {
    int[] arr = new int[100];
    @Test
    public void testMajorityElement() {
        MajorityElement me = new MajorityElement();
        for (int index = 0; index < arr.length; index++) {
            int number = ThreadLocalRandom.current().nextInt(0, 9);
            arr[index] = number;
        }
        assertEquals(-1, me.majorityElement(arr));
    }

}
