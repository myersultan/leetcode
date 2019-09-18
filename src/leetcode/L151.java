package leetcode;

import java.util.Arrays;

public class L151 {
    public static void main(String[] args) {
        System.out.print(reverseWords("a good   example"));
        System.out.println("222");
    }

    public static String reverseWords(String s) {
        String[] str = s.split("\\s+");
        String result = "";
        System.out.println(Arrays.toString(str));
        for (int i = 0; i < str.length; i++) {
            if(i == str.length - 1)
                result = str[i] + result;
            else
                result = " " + str[i] + result;
        }

        return result.trim();
    }
}
