package com.all;

public class MaxArea {
    public static void main(String[] args) {
        int[] x = {3846,7214,9316,9869,2423,4235,4921,5878,9832,5302,4298,4312,8571,531,3206,7504,8321,9385,657
                ,3095,1486,8099,1635,2735,1160,228,3388,1557,7094,4465,8611,3020,6142,182,4742,2507,3284,2005,7686,
                6688,3987,3137,781,5463,3098,3637,9384,7166,7751,6068,5560,9329,8846,6705,6672,7069,8478,7126,1758,1313,
                7419,1087,9752,4609,4133,821,6526,897,4482,7483,4920,6017,938,882,9106,6324,7766,8094,6619,8662,3577,1415,8896,1432,
                1104,95,4291,1289,5920,8682,9432,6298,3931,1803,401,6743,69,7138,2465,5315,6997,4722,2557,4915,7727,2196,9478,1355,
                8706,5934,1019,984,5214,800,8195,4819,8201,1796,3767,4032,40,4107};
        System.out.println(MaxArea.maxArea(x));



    }

    public static int maxArea(int[] height) {
//        int left;
//        int right;
//        int ar = 0;
//
//        for (int i = 0; i < height.length - 1; i++) {
//            left = height[i];
//            for (int j = height.length - 1; j >= 0; j--) {
//                right = height[j];
//                int x;
//                if (left >= right) {
//                    x = right * (j - i);
//                } else {
//                    x = left * (j - i);
//                }
//                 ar = Math.max(ar,x);
//            }
//
//
//        }
//
//        return ar;
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            int wid = right - left;
            int h = Math.min(height[left], height[right]);
            int area = h * wid;
            maxArea = Math.max(maxArea, area);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
}
