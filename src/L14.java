public class L14 {
    public static void main(String[] args) {
        String[] str = {"ca","a"};
        System.out.println("String: " + longestCommonPrefix(str));
    }

    public static String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0) {
            return "";
        }

        String shortStr = strs[0];

        for (int i = 1; i < strs.length; i++) {

            if(strs[i].length() < shortStr.length()) {
                shortStr = strs[i];
            }

        }

        int l = shortStr.length();
        while (l > 0) {
            int counter = 0;
            for (int i = 0; i < strs.length; i++) {
                if(strs[i].indexOf(shortStr) == 0){
                    counter++;
                }
            }
            if(counter == strs.length) {
                return shortStr;
            } else {
                l--;
                shortStr = shortStr.substring(0, shortStr.length()-1);
            }
        }

        return shortStr;
    }
}
