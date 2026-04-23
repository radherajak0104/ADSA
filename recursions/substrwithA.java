// printing all the substrings of a string which contains 'a'
public class substrwithA{
    // public static void printSubstringsWithA(String str, int i, String current) {
    //     if (i == str.length()) {
    //         if (current.contains("a")) {
    //             System.out.println(current);
    //         }
    //         return;
    //     }
    //     printSubstringsWithA(str, i + 1, current + str.charAt(i));
    //     printSubstringsWithA(str, i + 1, current);
    // }

    // public static void main(String[] args) {
    //     String str = "abc";
    //     printSubstringsWithA(str, 0, "");
    // }


    // to print count of all the substrings of a string which contains 'a'
     static int totalsum(String s, int i, boolean b) {
        if (i == s.length()) {
            return b ? 1 : 0;
        }
        
        int x = totalsum(s, i + 1, b || s.charAt(i) == 'a');
        int y = totalsum(s, i + 1, b);
        return x+y;
    }

     public static void main(String[] args) {
        String str = "abc";
        System.out.println(totalsum(str,0,false));
     }

}
