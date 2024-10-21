import org.example.Solution;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        String s = "ababccc";

        int expected = 5;
        int actual = new Solution().maxUniqueSplit(s);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void test2() {
        String s = "wwwzfvedwfvhsww";

        int expected = 11;
        int actual = new Solution().maxUniqueSplit(s);

        Assert.assertEquals(expected, actual);
    }
}
