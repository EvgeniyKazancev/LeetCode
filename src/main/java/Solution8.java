public class Solution8 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] res = new int[m + n];
        int a;
        int b;
        for (int i = 0, i1 = 0, i2 = 0; i < m + n; i++ ) {
            if (i1 >= nums1.length) {
                a = Integer.MAX_VALUE;
            } else {
                a = nums1[i1];
            }
            if (i2 >= nums2.length){
                b = Integer.MAX_VALUE;
            }else {
                b = nums2[i2];
            }
            if (a < b) {
                res[i] = a;
                i1++;
            } else {
                res[i] = b;
                i2++;
            }
        }
        nums1 = res;
    }
}
