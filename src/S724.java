public class S724 {
    public static void main(String[] args) {
        int[] nums = {-1,-1,0,1,1,0};
        int pivot = pivotIndex(nums);
        System.out.println("pivot: " + pivot);
    }

    public static int pivotIndex(int[] nums) {
        int sum = 0;
        int leftSum = 0;
        for (int x: nums) sum += x;
        for (int i = 0; i < nums.length; i++) {
            if (leftSum == sum - leftSum - nums[i]) return i;
            leftSum += nums[i];
        }

        return -1;
    }
}

// 1 ms	37.8 MB	java