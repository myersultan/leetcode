package leetcode;

import java.util.Arrays;

public class L747 {
    public static void main(String[] args) {
        int[] nums = {1};
        int dominant = dominantIndex(nums);
        System.out.println("dominant: " + dominant);
    }

    public static int dominantIndex(int[] nums) {
        int[] sorted = nums.clone();
        Arrays.sort(sorted);
        if(sorted.length == 1) return 0;
        if(sorted[sorted.length-1] == 0) return -1;
        if(sorted[sorted.length-2] == 0 || sorted[sorted.length-1] / sorted[sorted.length-2] >= 2) {
            for (int i = 0; i < nums.length; i++) {
                if(sorted[sorted.length-1] == nums[i]) return i;
            }
        }
        return -1;
    }
}

// 1 ms	34 MB	java
