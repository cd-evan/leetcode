package easy101_200;

import org.junit.Test;

public class LeetCode_108 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode buildTree(int[] nums, int l, int r) {
        if (l > r) return null;
        int m = (l + r) / 2;
        TreeNode node = new TreeNode(nums[m]);
        node.left = buildTree(nums, l, m - 1);
        node.right = buildTree(nums, m + 1, r);
        return node;
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null) return null;
        else return buildTree(nums, 0, nums.length - 1);
    }

    @Test
    public void testCode() {
        int[] nums = {-10, -3, 0, 5, 9};
        sortedArrayToBST(nums);
    }
}
