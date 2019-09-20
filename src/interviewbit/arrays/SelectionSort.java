package interviewbit.arrays;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = {3, 1, 4, 5, 2, 9, 7};
        sort(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void sort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int minIndex = findMinIndex(nums, i, nums.length);

            if(i != minIndex) {
                swap(nums, i, minIndex);
            }
        }
    }

    public static int findMinIndex(int[] nums, int start, int end) {
        int minIndex = start;
        for (int i = start + 1; i < end ; i++) {
            if (nums[i] < nums[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
