package interviewbit.arrays;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = {4, 2, 1, 5, 7, 3, 9};
        sort(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void sort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {

            for (int j = 0; j < nums.length - i - 2; j++) {
                if(nums[j] > nums[j+1]){
                    swap(nums, j, j+1);
                }
            }

        }
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
