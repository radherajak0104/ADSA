import java.util.Scanner;

public class recursion2 {
    static int power1(int x, int n){
        if(n==0){
            return 1;
        }
        return x*power1(x, n-1);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of x: ");
        int x = sc.nextInt();
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        // int x = 2;
        // int n = 3;
        System.out.println(power1(x,n));
        sc.close();
        }
        
        
    }
    

