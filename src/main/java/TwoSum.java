
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class TwoSum {
    public static void main(String[] args) {
        Integer a = 10000;
           Integer b = 10000;
             Integer c = 100;
             Integer d = 100;
            int e = 10000;
           int f = 100;

            System.out.printf("%b %b %b %b %b %b", a==e, b==e, a==b, c==f, d==f, c==d);
          }

    }

//    public int[] twoSum(int[] nums, int target) {
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1 ; j < nums.length; j++) {
//                if (nums[j] == target - nums[i]) {
//                    return new int[]{i,j};
//
//                }
//            }
//        }
//        return null;
//
//
//    }
//}
