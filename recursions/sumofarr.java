

public class sumofarr {
    public static int total = 0;
    public static int n = 0;
    public static void sum(int[] arr, int n){
        if (n == arr.length){
            System.out.println(total);
           return;
        }
        total = total + arr[n];
        sum(arr,n+1);
    }
    public static void main(String[] args) {
         int[] arr = {2,4,5,4};
         sum(arr, n);
    }
}
