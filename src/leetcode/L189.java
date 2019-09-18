package leetcode;

import java.util.Arrays;

// Rotate Array
public class L189 {
    public static void main(String[] args) {
        System.out.println("asdf");
        int[] nums = {1,2,3,4,5,6,7};
        rotate(nums, 3);
    }

    public static void rotate(int[] nums, int k) {
        for (int i = 0; i < k; i++) {
            int prev = nums[nums.length-1];
            for (int j = 0; j < nums.length; j++) {
                int temp = nums[j];
                nums[j] = prev;
                prev = temp;
            }
        }

    }
}
