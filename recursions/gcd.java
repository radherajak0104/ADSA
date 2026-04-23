import java.util.Scanner;

public class gcd {
    
    public static int gcd1(int a, int b){
        if (b == 0) {
            return a;
        }
        return gcd1(b, a % b);
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers one: ");
        int a = sc.nextInt();
        System.out.print("Enter numbers two: ");
        int b = sc.nextInt();
        int result = gcd1(a, b);
        System.out.println("The GCD of " + a + " and " + b + " is: " + result);
        sc.close();
    }
    
}
