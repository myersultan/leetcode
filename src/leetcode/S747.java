package leetcode;

public class S747 {
    public static void main(String[] args) {
        int[] nums = {1};
        int dominant = dominantIndex(nums);
        System.out.println("dominant: " + dominant);
    }

    public static int dominantIndex(int[] nums) {
        int maxIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > nums[maxIndex])
                maxIndex = i;
        }

        for (int i = 0; i < nums.length; i++) {
            if(maxIndex != i && nums[maxIndex] < 2 * nums[i])
                return -1;
        }
        return maxIndex;
    }
}
