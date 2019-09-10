public class L209 {
    public static void main(String[] args) {
        int s = 7;
        int[] nums = {2,4,3,1,2,1,3};
        System.out.println(minSubArrayLen(s, nums));
    }

    public static int minSubArrayLen(int s, int[] nums) {
        int ans = Integer.MAX_VALUE;
        int sum = 0, l = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            while (sum >= s) {
                ans = Math.min(ans, i+1-l);
                sum -= nums[l++];
            }
        }

        return (ans != Integer.MAX_VALUE) ? ans : 0;
    }
}


