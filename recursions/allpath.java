public class allpath {
    static void path(String str, int r, int c){
       if (r == 1 && c ==1) {
           System.out.println(str);
           return;
        
       } 
        if (r>1) path(str + "r", r-1, c);
        if (c>1) path(str + "c", r, c-1);   
        
    }
    public static void main(String[] args) {
        int r = 2, c = 3;
        path("", r, c);
    }
}
