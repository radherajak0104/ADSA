// sub sequence of array is pallandrome or not
public class substrpal {
    public static boolean ispalindrome(String str, int i, int j) {
        if (i >= j) return true;
        if (str.charAt(i) != str.charAt(j)) return false;
        return ispalindrome(str, i + 1, j - 1);
    }

    public static void main(String[] args) {
        String str = "abcaa";
        System.out.println(ispalindrome(str, 0, str.length() - 1));
    }
}
