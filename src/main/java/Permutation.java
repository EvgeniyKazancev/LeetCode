import java.util.Arrays;

public class Permutation {
    public static void main(String[] args) {


        Permutation p = new Permutation();

        p.nextPermutation(new int[]{3, 2, 1});
    }

    public void nextPermutation(int[] nums) {
        int index1 = -1;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                index1 = i;

            }
        }
        if (index1 == -1) {
            Arrays.sort(nums);
            System.out.println(Arrays.toString(nums));
            return;
        }
        System.out.println(index1);
        int min = index1 + 1;
        int index2 = min;
        for (; index2 < nums.length; index2++) {
            System.out.println(nums[index2] + "," + nums[index1] + "," + nums[min]);
            if (nums[index2] > nums[index1] && nums[index2] < nums[min]) {

                min = index2;
            }
        }

        System.out.println(min);

        int x = nums[index1];
        nums[index1] = nums[min];
        nums[min] = x;
        System.out.println(Arrays.toString(nums));
        Arrays.sort(nums, index1 + 1, nums.length);
        System.out.println(Arrays.toString(nums));

    }




//      do {
//          sum += weights[index];
//          count++;
//          index++;
//      }
//        while (index < weights.length); {
//            double averageWeight = sum / count;
//
//            if (averageWeight < referenceWeight * 0.9) {
//                System.out.println("Not enough substance");
//            } else {
//                System.out.println("Ok");
//            }
//        }


    }



