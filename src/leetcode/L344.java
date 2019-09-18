package leetcode;

import java.util.Arrays;

public class L344 {
    public static void main(String[] args) {
        char[] input = {'h', 'e', 'l', 'l', 'o'};
        reverseString(input);
    }

    public static void reverseString(char[] s) {
        int i = 0;
        int j = s.length-1;

        while (i < j) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }

        System.out.println(Arrays.toString(s));
    }

}
