import java.util.Scanner;

public class substring {
 
    public static void printSubstrings(String str, int index, String current) {
        if (index == str.length()) {
            return;
        }
        current += str.charAt(index);
        System.out.println(current);
        printSubstrings(str, index + 1, current);
        printSubstrings(str, index + 1, current.substring(0, current.length() - 1));
       
    }  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        System.out.println("Substrings of the string are:");
        printSubstrings(str, 0, "");
        sc.close();
    }
}
