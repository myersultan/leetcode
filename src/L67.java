public class L67 {
    public static void main(String[] args) {
        String a = "11";
        String b = "1";
        System.out.println(addBinary(a, b));
    }

    public static String addBinary(String a, String b) {
        String res = "";

        int s = 0;

        int i = a.length()-1, j = b.length()-1;

        while (i >= 0 || j >= 0 || s == 1) {

            s += ((i >= 0) ? a.charAt(i) - '0': 0);
            s += ((j >= 0) ? b.charAt(j) - '0': 0);

            res = (char)(s % 2 + '0') + res;

            s /= 2;

            i--;
            j--;
        }

        return res;
    }
}
