public class L724 {
    public static void main(String[] args) {
        int[] nums = {-1,-1,0,1,1,0};
        int pivot = pivotIndex(nums);
        System.out.println("pivot: " + pivot);
    }

    public static int pivotIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int p = i;
            int sumL = sumLeft(p, nums);
            int sumR = sumRight(p, nums);

            if(sumL == sumR)
                return p;

        }

        return -1;
    }

    public static int sumLeft(int p, int[] nums) {
        int sum = 0;
        for (int i = 0; i < p; i++) {
            sum += nums[i];
        }
        return sum;
    }

    public static int sumRight(int p, int[] nums) {
        int sum = 0;
        for (int i = p+1; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;
    }
}

// 198 ms	53.6 MB	java
