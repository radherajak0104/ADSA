
import java.util.Scanner;

public class countzero {
    public static int counts=0;
    static int count(int n ){
        
        if (n  == 0) {
          return counts;
        }
        int remain = n%10;
        if (remain==0) {
           
            counts = counts + 1;
        }
       return count(n/10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers : ");
        int n = sc.nextInt();
       
        System.out.println(count(n));
        sc.close();
    }
}
