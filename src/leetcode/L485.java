package leetcode;

public class L485 {
    public static void main(String[] args) {
        int[] input = {1, 1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(input));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int k = 0; int max = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                k++;
                max = Math.max(max, k);
            } else {
                k=0;
            }
        }

        return max;
    }
}
