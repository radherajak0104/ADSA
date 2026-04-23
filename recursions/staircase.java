import java.util.Scanner;

public class staircase {
public static int count = 0;
    static void path(String str, int n){
       if (n == 0) {
        System.out.println(str);
        count++;
           return;
        
       } 
        if (n>0) path(str + "1", n-1);
        if (n>1) path(str + "2", n-2);   
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter stairs number: ");
        int n = sc.nextInt();
        path("", n);
        System.out.print("steps count: ");
        System.out.print(count);
        sc.close();
    }
}
