public class substringOfN {
    
    public static void printSubstrings(String p, String str, int n) {
      if (p.length()==n) {
        System.out.println(p);
        return;
      }  
      if (str.isEmpty()) return;
        
      char ch = str.charAt(0);
      printSubstrings(p+ch, str.substring(1), n);
      printSubstrings(p, str.substring(1), n);
    
    }
    public static void main(String[] args) {
        
        String str = "abfc";
        int n = 2;
        String p = "";

        printSubstrings(p, str, n);
    }
}

