// sum of subarray is even or not and count the number of even sum subarrays
public class evenarrsum {
    public static int count = 0;        
    public static int sumofsubsequences(int[] arr, int i, int sum) {
        if (i == arr.length) {
            if (sum % 2 == 0) {
                count++;
            }
            return sum;
        }
        int x = sumofsubsequences(arr, i + 1, sum + arr[i]);
        int y = sumofsubsequences(arr, i + 1, sum);
        return count;
    }

   
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter array: ");
        // int n = sc.nextInt();
        // int[] arr = new int[n];
        int arr[] = {1, 2, 3};
        int sum = 0;
        int i = 0;
        count = 0;
        
        System.out.println(sumofsubsequences(arr, 0, 0));
        // sc.close();

    }
}



