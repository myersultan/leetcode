import java.util.Arrays;

public class L557 {
    public static void main(String[] args) {
        System.out.println(reverseWords("Let's take LeetCode contest"));
    }

    public static String reverseWords(String s) {
        String[] str = s.split(" ");
        for (int i = 0; i < str.length; i++) {
            str[i] = reverseWord(str[i]);
        }

        return String.join(" ", str);
    }

    public static String reverseWord(String s) {
        char[] c = s.toCharArray();
        int start = 0;
        int end = c.length - 1;
        while(start < end) {
            char temp = c[start];
            c[start] = c[end];
            c[end] = temp;
            start ++;
            end --;
        }

        return new String(c);
    }
}
