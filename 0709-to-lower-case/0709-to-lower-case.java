class Solution {
    public String toLowerCase(String s) {
        char[] ch = s.toCharArray(); 
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] >= 65 && ch[i] <= 90) { // A = 65 , Z = 90 , a = 65+32
                ch[i] = (char)(ch[i] + 32); // Explicit type Casting.
            }
        }
        return new String(ch); 
    }
}

// EXTRA---------------------------------------------------
// class Solution {                                       -
//     public String toLowerCase(String s) {              -
//         String result= s.toLowerCase();                -   
//         return result;                                 -
//     }                                                  -
// }                                                      -
// --------------------------------------------------------