package leetcode;

public class L1052 {
    public static void main(String[] args) {
        //C - 138
        int[] customers = {7,8,8,6};
        int[] customers1 = {9,10,4,5};
        int[] customers2 = {4,10,10};
        int[] customers3 = {6,10,2,1,7,9};
        int[] grumpy = {0,1,0,1};
        int[] grumpy1 = {1,0,1,1};
        int[] grumpy2 = {1,0,0};
        int[] grumpy3 = {1,0,0,0,0,1};
        int x = 3;
        int x1 = 1;
        int x2 = 2;
        int x3 = 3;

//        System.out.println(maxSatisfied(customers, grumpy, x));
//        System.out.println(maxSatisfied(customers1, grumpy1, x1));
//        System.out.println(maxSatisfied(customers2, grumpy2, x2));
        System.out.println(maxSatisfied(customers3, grumpy3, x3));
    }

    public static int maxSatisfied(int[] customers, int[] grumpy, int X) {

        int max = 0;
        int maxIndex = 0;
        int res = 0;
        for (int i = 0; i < customers.length - X + 1; i++) {
            int sum = 0;
            for (int j = i; j < i+X; j++) {
                if(grumpy[j] == 1) {
                    sum += customers[j];
                }
            }
            if(sum > max) {
                max = sum;
                maxIndex = i;
            }
        }
        System.out.println(max);
        System.out.println(maxIndex);

        for (int i = 0; i < customers.length; i++) {
            if (i < maxIndex || i >= maxIndex + X) {
                if (grumpy[i] == 0) {
                    res += customers[i];
                }
            } else {
                res += customers[i];
            }
        }
        return res;
    }
}
