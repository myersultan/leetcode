import java.util.Arrays;

public class L561 {
    public static void main(String[] args) {
        int[] input = {1, 4, 3, 2};
        System.out.println(arrayPairSum(input));
    }

    public static int arrayPairSum(int[] nums) {
        int sum = 0;

        if(nums == null || nums.length == 0) return sum;

        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if(i % 2 == 0)
                sum += nums[i];
        }

        return sum;
    }
}
