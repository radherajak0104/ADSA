public class substr {
    public static void main(String[] args) {
            // give all sub string and find that have same first and last value

       String str = "abc";
       for(int i=0; i<str.length(); i++)
        for(int j=i; j<str.length(); j++){
            if(str.charAt(i) == str.charAt(j)){
                System.out.println(str.substring(i, j+1));
            }
        }
    }
    
}




// public class substr {
//     public static void main(String[] args) {
//             // give all possible sub string and find that have same first and last value

//        String str = "abc";
//        int count = 0;
//        for(int i=0; i<str.length(); i++){
//         for(int j=i; j<str.length(); j++){
//             if(str.charAt(i) == str.charAt(j)){
//                 count++;
//                }
//             }
//         }
//     System.out.println(count);
//     }
    
    
// }

