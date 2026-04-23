
public class maxnum {
    

    public static int sumofsubsequences(int[] arr, int i, int sum) {
        if (i == arr.length) {
           
            return sum;
        }
        int x = sumofsubsequences(arr, i + 1, sum + arr[i]);
        int y = sumofsubsequences(arr, i + 1, sum);
        return Math.max(x, y);
        
    }

   
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter array: ");
        // int n = sc.nextInt();
        // int[] arr = new int[n];
        int arr[] = {1, 2, 3};
        int sum = 0;
        int i = 0;
        
        System.out.println(sumofsubsequences(arr, 0, 0));
        // sc.close();

    }
}


