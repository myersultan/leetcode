package interviewbit.arrays.repeat1;

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
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
    }
}
