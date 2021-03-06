package easy50_100;

import org.junit.Test;

public class LeetCode_88 {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index = nums1.length - 1;
        m -= 1;
        n -= 1;
        while (m >= 0 && n >= 0) {
            if (nums1[m] >= nums2[n]) {
                nums1[index--] = nums1[m--];
            } else {
                nums1[index--] = nums2[n--];
            }
        }
        for (int i = m; i >= 0; i--)
            nums1[index--] = nums1[m--];
        for (int i = n; i >= 0; i--)
            nums1[index--] = nums2[n--];
    }

    @Test
    public void testCode() {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        merge(nums1, m, nums2, n);
        for (int i = 0; i < nums1.length; i++)
            System.out.println(nums1[i]);
    }
}
