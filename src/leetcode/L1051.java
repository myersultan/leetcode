package leetcode;

import java.util.Arrays;

public class L1051 {
    public static void main(String[] args) {
        // Contest-138
        int[] input = {1,1,4,2,1,3};
        System.out.println(heightChecker(input));
    }

    public static int heightChecker(int[] heights) {
        int counter = 0;
        int[] copyOfHeights = Arrays.copyOf(heights, heights.length);
        Arrays.sort(heights);
        for (int i = 0; i < heights.length; i++) {
            if (copyOfHeights[i] != heights[i]){
                counter ++;
            }
        }
        return counter;
    }
}
