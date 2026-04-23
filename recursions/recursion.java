public class recursion {
    public static void main(String[] args) {
        String str = "12";
        String str1 = "5";
        int num = 0;
        int num1 = 0;

        for(int i=0; i<str.length(); i++)
        {
            num = num+10 + (str.charAt(i)-'0');
        }
        for(int i =0; i< str1.length(); i++){
            num1 = num1 + 10 + (str1.charAt(i)-'0');
        }
        System.out.println(num+num1);

    }
    
}