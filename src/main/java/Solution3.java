public class Solution3 {

    public int removeDuplicates(int[] nums) {
        if (nums.length <= 1) {
            return nums.length;
        }
        int front = 1;
        int tail = 0;
        while (front < nums.length)
            if (nums[front] != nums[tail]) {
                tail += 1;
                nums[tail] = nums[front];
            } else
                front += 1;
        return tail + 1;
    }
}