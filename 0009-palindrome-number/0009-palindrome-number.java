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