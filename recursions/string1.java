public class string1 {
    public static void main(String[] args) {
        String str = "Hello";
        String str2 = new String("Byee");
        System.out.println(str);
        System.out.println(str2);
        System.out.println(str.length());
        System.out.println(str2.length());
        System.out.println(str.replace('H', 'm'));
        System.out.println(str.substring(0,2));
        System.out.println(str.toUpperCase());
        System.out.println(str2.toLowerCase());
        System.out.println(str.charAt(4));
        System.out.println(str.contains(str2));
        str.toCharArray();
        String rev = "";
        for(int i = str.length()-1; i>=0; i--){
            rev = rev + str.charAt(i);

        }
        System.out.println(rev);
        if (str.equals(rev)) {
            System.out.println("palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }
    
}
