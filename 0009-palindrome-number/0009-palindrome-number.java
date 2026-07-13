class Solution {
    public boolean isPalindrome(int x) {
        String str = Integer.toString(x);
        int i=0;
        int n = str.length()-1;
        while(i<n) {
            if (str.charAt(i) != str.charAt(n)) { 
                return false;
            }
            i++;
            n--;

        }
        return true;
        
    }
}
//  optimize code : ---------------------------------------------------------------
// class Solution {
//     public boolean isPalindrome(int n) {
//         int original =n;
//         int rev = 0;

//         while(n > 0) {
//             int digit = n % 10;   // last digit
//             rev = rev * 10 + digit;
//             n = n / 10;
//         }
//         if(rev == original )
//             return true;
//         else
//             return false;
//     }
// }