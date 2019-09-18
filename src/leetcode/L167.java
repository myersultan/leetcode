package leetcode;

import java.util.Arrays;

public class L167 {
    public static void main(String[] args) {
        int[] input = {0,0,3,4};
        int target = 0;
        System.out.println(Arrays.toString(twoSum(input, target)));
    }

    public static int[] twoSum(int[] numbers, int target) {

        int sum = 0;
        if(target == sum) {
            return new int[] {1, 2};
        }
        int i = 0, j = numbers.length - 1;
        while (sum != target && i < j) {
            sum = numbers[i] + numbers[j];
            if(sum > target) {
                j--;
            } else if(sum < target) {
                i++;
            }
        }

        return new int[] {i+1, j+1};


    }
}
