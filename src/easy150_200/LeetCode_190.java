package easy150_200;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LeetCode_190 {

    public int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result = (result << 1) + (n & 1);
            n >>= 1;
        }
        return result;
    }

    @Test
    public void testCode() {
        assertEquals(reverseBits(43261596), 964176192);
        // assertEquals(reverseBits(4294967293), 3221225471);
    }
}
