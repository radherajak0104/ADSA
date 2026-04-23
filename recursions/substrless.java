// printing all the sub arrays of which product of all the characters is less than k
public class substrless {
    static int subarr(int[] arr, int i, int j,int k) {
        if (i == arr.length) {
            if (j<k && j!=1) {
                return 1;
                
            }
            return 0;

        }
        int x = subarr(arr, i + 1, j*arr[i],k);
        int y = subarr(arr, i + 1, j,k);
        return x+y;
        
    }
   public static void main(String[] args) {
          int[] arr = {1, 2, 3};
          int k = 5;
          System.out.println(subarr(arr, 0, 1, k));

   }

}
