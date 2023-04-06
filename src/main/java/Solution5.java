import java.util.Arrays;

public class Solution5 {
    public static void main(String[] args) {
        Solution5 solution5 = new Solution5();
        int[] digits = {1,3,5,6,8,9};
        int[] result = solution5.plusOne(digits);
        System.out.println(Arrays.toString(result));

    }

    public int[] plusOne(int[] digits) {
        int index = digits.length;
        int[] arr = new int[index + 1];
        System.arraycopy(digits,0,arr,1,index);
        boolean fuck = true;
        for (int i = index ; i >= 0; i--) {
            arr[i] = arr[i] + (fuck ? 1 : 0);
            if (arr[i] == 10){
                arr[i] = 0;
            }else
                fuck = false;

        }

        if(arr[0] == 0){
            System.arraycopy(arr,1,digits,0,index);
            return digits;
        }else {
            return arr;
        }
    }
}