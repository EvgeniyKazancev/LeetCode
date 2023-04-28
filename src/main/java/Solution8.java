import java.util.Arrays;

public class Solution8 {
    public static void main(String[] args) {
        Solution8 solution8 = new Solution8();
        int[] nums1 = {1, 1, 4, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        int[] arr = new int[m + n];
        solution8.merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = n, j = 0; j < n; j++) {
            nums1[i] = nums2[j];
            i++;
        }
      Arrays.sort(nums1);
    }
}

