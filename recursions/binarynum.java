import java.util.*;
public class binarynum {
    public static void printBinary(int n, String current) {
        if (n == 0) {
            System.out.println(current);
            return;
        }
        printBinary(n - 1, current + "0");
        printBinary(n - 1, current + "1");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length : ");
        int n = sc.nextInt();
        System.out.println("Binary numbers of length " + n + ":");
        printBinary(n, "");
        sc.close();
    }
}
