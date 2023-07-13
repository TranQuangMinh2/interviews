import org.junit.Test;

public class RandomizedSetTest {
    @Test
    public void testInsert() {
        RandomizedSet randomSet = new RandomizedSet();
        assert randomSet.insert(1) == true;
        assert randomSet.insert(2) == true;
        assert randomSet.insert(2) == false;
    }
}
