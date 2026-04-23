import java.util.Scanner;
public class substringcount {
    public static int count = 0;
    public static void printSubstringscount(String str, int index, String current) {
        if (index == str.length()) {
            return;
        }
        current += str.charAt(index);
        count++;
        printSubstringscount(str, index + 1, current);
        printSubstringscount(str, index + 1, current.substring(0, current.length() - 1));
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        System.out.println("Substrings count of the string are:");
        printSubstringscount(str, 0, "");
        System.out.println(count);
        sc.close();
    }
}
