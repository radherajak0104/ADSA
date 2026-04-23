// can substring be divided into two equal parts
public class equalstr {
    public static boolean isEqual(String str, int i, int j) {
        if (i >= j) return true;
        if (str.charAt(i) != str.charAt(j)) return false;
        return isEqual(str, i + 1, j - 1);
    }

    public static void main(String[] args) {
        String str = "abcaba";
        System.out.println(isEqual(str, 0, str.length() - 1));
    }
}
